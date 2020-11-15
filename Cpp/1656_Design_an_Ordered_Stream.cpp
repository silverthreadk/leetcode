class OrderedStream {
public:
    OrderedStream(int n) : streams(n + 1), ptr(1){
        
    }
    
    vector<string> insert(int id, string value) {
        streams[id] = value;
        vector<string> result;
        
        if(ptr != id) return result;
        
        for(; ptr < streams.size() && !streams[ptr].empty(); ++ptr) {
            result.push_back(streams[ptr]);
        }
        
        return result;
    }
private:
    vector<string> streams;
    int ptr;
};

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream* obj = new OrderedStream(n);
 * vector<string> param_1 = obj->insert(id,value);
 */