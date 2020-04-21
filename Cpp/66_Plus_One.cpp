class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n = digits.size() - 1;
        digits[n] = (digits[n] + 1) % 10;
        int carry = digits[n] == 0 ? 1 : 0;
        
        for(int i = n-1; i>=0 && carry == 1; --i){
            digits[i] = (digits[i] + carry) % 10;
            carry = digits[i] == 0 ? 1 : 0;
        }
        
        if(carry == 1) {
            digits.insert(digits.begin(), 1);
        }
        
        return digits;
    }
};