class Solution {
public:
    bool isPowerOfThree(int n) {
        if(n < 1) return false;
        if(n == 1) return true;
        
        int i = n;
        while(i > 1) {
            if(i%3 != 0) return false;
            i /= 3;           
        }
        
        return true;
    }
};