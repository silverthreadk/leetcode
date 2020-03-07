class LRUCache {
public:
    LRUCache(int capacity) : max_size(capacity) {
    }
    
    int get(int key) {
        auto found = m.find(key);
        if(found == m.end()) return -1;
        
        auto hit = *(found->second);
        l.erase(found->second);
        l.push_front(hit);
        m[key] = l.begin();
        return l.begin()->second;
    }
    
    void put(int key, int value) {
        auto found = m.find(key);
        if(found != m.end()){
            l.erase(found->second);
        } else if(l.size() == max_size){
            m.erase(l.back().first);
            l.pop_back();
        }
        l.push_front({key, value});
        m[key] = l.begin();
    }
    
private:
    unordered_map<int, list<pair<int, int>>::iterator> m;
    list<pair<int, int>> l;
    int max_size;
};

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache* obj = new LRUCache(capacity);
 * int param_1 = obj->get(key);
 * obj->put(key,value);
 */