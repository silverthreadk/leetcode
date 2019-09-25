class Solution {
public:
    int minAddToMakeValid(string S) {
        int result = 0;
        int open = 0;
        for(auto& ch : S){
            if(ch == '('){
                ++open;
            }else if(open != 0){
                --open;
            }else{
                ++result;
            }
        }
        result += open;
        return result;
    }
};