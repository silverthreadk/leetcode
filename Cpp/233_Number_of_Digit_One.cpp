class Solution {
public:
    int countDigitOne(int n) {
        int result = 0;
        int curr = n;
        unsigned int digit_number = 1;
        while (curr != 0) {
            int remainder = curr % 10;
            curr = curr / 10;
            
            if (remainder == 1) {
                result += (curr * digit_number + (n % digit_number) + 1);
            } else if (remainder > 1){
                result += (curr * digit_number + digit_number);
            } else {
                result += (curr * digit_number);
            }
            
            digit_number *=10;
        }
        return result;
    }
};