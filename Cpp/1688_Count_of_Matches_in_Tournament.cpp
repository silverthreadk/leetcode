class Solution {
public:
    int numberOfMatches(int n) {
        int result = 0;
        int team = n;
        while(team != 1) {
            result += team/2;
            if(team % 2 == 0) team /= 2;
            else team = team/2 + 1;
        }
        
        return result;
    }
};