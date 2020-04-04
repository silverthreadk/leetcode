class Solution {
public:
    bool isHappy(int n) {
        long sum = n;
        while(sum/10 != 0){
            long i = sum;
            sum = 0;
            for(; i!=0; i/=10){
                sum += pow(i%10, 2);
            }
        }
        
        return sum == 1 || sum == 7;
    }
};