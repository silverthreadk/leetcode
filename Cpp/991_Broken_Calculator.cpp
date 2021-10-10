class Solution {
public:
    int brokenCalc(int startValue, int target) {
        int result = 0;
        int current = target;
        
        while(current > startValue){
            if(current %2 == 1){
                ++result;
                ++current;
            }
            ++result;
            current /= 2;
        }
        result += (startValue - current);
        
        return result;
    }
};