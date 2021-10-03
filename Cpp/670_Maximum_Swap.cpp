class Solution {
public:
    int maximumSwap(int num) {
        string s = to_string(num);
        unordered_map<int, int> index;
        
        for(int i = 0; i< s.size(); ++i) {
            index[s[i] - '0'] = i; 
        }
        
        for(int i = 0; i < s.size(); ++i) {
            for(int j = 9; j > s[i] - '0'; --j) {
                if(index[j] > i) {
                    swap(s[index[j]], s[i]);
                    return stoi(s);
                }
            }
        }
        
        return stoi(s);
    }
};