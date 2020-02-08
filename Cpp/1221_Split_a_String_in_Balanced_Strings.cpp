class Solution {
public:
    int balancedStringSplit(string s) {
        int result = 0;
        int balance = 0;
        for(auto& ch : s){
            if(ch == 'R') ++balance;
            else if(ch == 'L') --balance;
            if(balance == 0) ++result;
        }
        
        return result;
    }
};