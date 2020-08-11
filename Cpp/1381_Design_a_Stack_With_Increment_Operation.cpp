class CustomStack {
public:
    CustomStack(int maxSize) :s(maxSize, 0), top(0){
        
    }
    
    void push(int x) {
        if(top >= s.size()) return;
        s[top] = x;
        ++top;
    }
    
    int pop() {
        if(top == 0) return -1;
        --top;
        int val = s[top];
        
        return val;
    }
    
    void increment(int k, int val) {
        int end = min(k, top);
        for(int i=0; i<end; ++i){
            s[i] += val;
        }
    }
    
private:
    vector<int> s;
    int top;
};

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack* obj = new CustomStack(maxSize);
 * obj->push(x);
 * int param_2 = obj->pop();
 * obj->increment(k,val);
 */