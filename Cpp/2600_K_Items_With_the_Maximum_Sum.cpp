class Solution {
public:
    int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int current = k;
        int count = min(numOnes, current);
        int result = count;
        
        current -= count;

        if(current <= 0) return result;

        count = min(numZeros, current);
        current -= count;

        if(current <= 0) return result;

        result -= current;

        return result;
    }
};