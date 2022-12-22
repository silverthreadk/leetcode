class Solution {
public:
    int countBalls(int lowLimit, int highLimit) {
        int result = 0;
        vector<int> count(46);

        for(int i = lowLimit; i <= highLimit; ++i) {
            int sum = 0;
            int n = i;

            while(n) {
                sum += n % 10;
                n /= 10; 
            }

            result = max(result, ++count[sum]);
        }
        
        return result;
    }
};