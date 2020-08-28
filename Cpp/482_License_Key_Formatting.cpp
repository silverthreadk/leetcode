class Solution {
public:
    string licenseKeyFormatting(string S, int K) {
        string result = "";
        int char_count = 0;
        for(int i=S.size()-1; i>=0; --i){
            if(S[i] == '-') continue;
            if(char_count != 0 && char_count%K == 0) result += '-';
            result += toupper(S[i]);
            ++char_count;
        }
        
        return string(result.rbegin(), result.rend());
    }
};