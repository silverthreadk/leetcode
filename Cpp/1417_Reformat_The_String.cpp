class Solution {
public:
    string reformat(string s) {
        string result = "";
        string num = "";
        string alpha = "";
        
        for(auto& ch : s) {
            if(isdigit(ch)) num += ch;
            if(isalpha(ch)) alpha += ch;
        }
        if(num.length() > alpha.length() + 1 || alpha.length() > num.length() + 1) return "";
        
        string first;
        string second;
        if(num.length() > alpha.length()) {
            first = num;
            second = alpha;
        } else {
            first = alpha;
            second = num;
        }
        
        for(int i = 0; i < second.length(); ++i){
            result += first[i];
            result += second[i];
        }
        if(first.length() > second.length()) result += first.back();
        
        return result;
    }
};