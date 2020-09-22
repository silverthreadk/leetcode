class Solution {
public:
    string thousandSeparator(int n) {
        if(n<1000){
            return to_string(n);
        }
        string result = "";
        
        int current = n;
        int digit = 0;
        while(current){
            if(digit%3 == 0 && digit != 0){
                result = '.' + result;
            }
            result = to_string(current%10) + result;
            ++digit;
            current /= 10;
        }
        
        return result;
    }
};