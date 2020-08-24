class Solution {
public:
    string alphabetBoardPath(string target) {
        string result = "";
        int prev_r = 0;
        int prev_c = 0;
        
        for(auto& ch: target) {
            int r = (ch - 'a') / 5;
            int c = (ch - 'a') % 5;
            
            int diff_r = r - prev_r;
            int diff_c = c - prev_c;
            
            if(diff_r < 0) {
                result += string(-diff_r, 'U');
            }
            
            if(diff_c < 0){
                result += string(-diff_c, 'L');
            }
            
            if(diff_r > 0){
                result += string(diff_r, 'D');
            }
            
            if(diff_c > 0){
                result += string(diff_c, 'R');
            }
            
            result += '!';
            
            
            prev_r = r;
            prev_c = c;
        }
        
        return result;
    }
};