class Solution {
public:
    int maxScore(string s) {
        int result = 0;
        int one = 0;
        int zero = 0;

        for(auto& ch : s) {
            if(ch == '1') ++one;
        }

        for(int i = 0; i < s.size() - 1; ++i) {
            if(s[i] == '0') ++zero;
            if(s[i] == '1') --one;

            result = max(result, zero + one);
        }

        return result;
    }
};