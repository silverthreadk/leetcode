class Solution {
public:
    bool checkRecord(string s) {
        int absent_count = 0;
        int late_count = 0;
        for(int i=0; i<s.size(); ++i){
            if(s[i] == 'A') {
                ++absent_count;
                if(absent_count > 1) return false;
            } else if(s[i] == 'L'){
                ++late_count;
                if(late_count > 2) return false;
                continue;
            }
            late_count = 0;
        }
        
        return true;
    }
};