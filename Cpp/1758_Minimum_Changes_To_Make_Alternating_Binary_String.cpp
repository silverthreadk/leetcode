class Solution {
public:
    int minOperations(string s) {
        int result = 0;
        int n = s.size();
        
        for(int i = 0; i < n; ++i){
            if(s[i] - '0' != i % 2) ++result;
        }

        return min(result, n - result);
    }
};