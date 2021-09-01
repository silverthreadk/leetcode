class Solution {
public:
    int reverse(int x) {
        long result = x % 10;
        int current = x / 10;
        
        while(current) {
            result = result * 10 + current % 10;
            current /= 10;
        }

        if (result <= INT_MIN || result >= INT_MAX) return 0;
        return result;
    }
};