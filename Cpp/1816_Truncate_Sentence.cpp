class Solution {
public:
    string truncateSentence(string s, int k) {
        string result = "";
        int i = 0;
        for(auto& ch : s){
            if(ch == ' ') ++i;
            if(k == i) return result;
            result += ch;
        }
        
        return result;
    }
};