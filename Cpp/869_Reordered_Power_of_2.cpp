class Solution {
public:
    bool reorderedPowerOf2(int N) {
        string N_str = to_string(N);
        sort(N_str.begin(), N_str.end());
        for(int i=0; i<31; ++i) {
            string str = to_string(1<<i);
            if(N_str.size() != str.size()) continue;
            else if(N_str.size() < str.size()) return false;
            
            sort(str.begin(), str.end());
            if(N_str == str) return true;
        }
        return false;
    }
};