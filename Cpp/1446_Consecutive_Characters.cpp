class Solution {
public:
    int maxPower(string s) {
        int result = 1;
        int count = 1;
        for(int i=1; i<s.size(); ++i){
            if(s[i] == s[i-1]){
                ++count;
            } else {
                result = max(result, count);
                count = 1;
            }
        }
        
        return max(result, count);
    }
};