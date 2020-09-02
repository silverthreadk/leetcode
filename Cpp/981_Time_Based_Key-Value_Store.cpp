class TimeMap {
public:
    /** Initialize your data structure here. */
    TimeMap() {
        
    }
    
    void set(string key, string value, int timestamp) {
        if(m[key].find(timestamp) != m[key].end()) return;
        m[key][timestamp] = value;
    }
    
    string get(string key, int timestamp) {
        if(m.find(key) == m.end()) return "";
        
        auto found = m[key].upper_bound(timestamp);
        if(prev(found)->first > timestamp) return "";
        
        return prev(found)->second;
    }
private:
    unordered_map<string, map<int, string>> m;
};

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap* obj = new TimeMap();
 * obj->set(key,value,timestamp);
 * string param_2 = obj->get(key,timestamp);
 */