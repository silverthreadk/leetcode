class Solution {
public:
    int countSegments(string s) {
        int result = 0;
        bool is_privious_space = true;
        for(auto& ch : s){
            if(!is_privious_space && ch == ' '){
                ++result;
            }
            is_privious_space = ch == ' ';
        }
        
        return result;
    }
};