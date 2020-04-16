class Solution {
public:
    bool checkValidString(string s) {
        int min_open = 0;
        int max_open = 0;
        
        for(auto& ch : s){
            if(ch == '('){
                ++min_open;
                ++max_open;
            } else if(ch == ')') {
                --min_open;
                --max_open;
            } else {
                --min_open;
                ++max_open;
            }
            
            if (max_open < 0) return false;
            
            min_open = max(min_open, 0);
        }

        return min_open == 0;
    }
};