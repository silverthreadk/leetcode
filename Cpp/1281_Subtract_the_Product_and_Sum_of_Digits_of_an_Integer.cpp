class Solution {
public:
    int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int current = n;
        int remainder = 0;
        
        while(current > 0) {
            remainder = current % 10;
            sum += remainder;
            product *= remainder;
            current = current/10;
        }
        
        return product - sum;
    }
};