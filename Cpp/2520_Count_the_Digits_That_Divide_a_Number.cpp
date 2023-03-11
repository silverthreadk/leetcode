class Solution {
public:
    int countDigits(int num) {
        int result = 0;
        int current = num;

        while(current > 0){
            int remainder = current % 10;
            if(num % remainder == 0) ++result;
            current = current / 10;
        }

        return result;
    }
};