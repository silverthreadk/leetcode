class Solution {
public:
    int trailingZeroes(int n) {
        int result = 0;
        int i = n;
        while(i){
            i /= 5;
            result += i;
        }
        return result;
    }
};