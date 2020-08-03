class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0) return false;
        
        long reverted = 0;
        int n = x;
        while(n != 0){
            reverted = reverted * 10 + (n % 10);
            n/=10;
        }
        
        return reverted == x;
    }
};