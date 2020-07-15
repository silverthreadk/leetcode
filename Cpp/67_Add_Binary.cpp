class Solution {
public:
    string addBinary(string a, string b) {
        string result;
        string num1 = a;
        string num2 = b;
        
        reverse(num1.begin(), num1.end());
        reverse(num2.begin(), num2.end());
        if (a.size() > b.size()){
           for(int i=0; i<a.size()-b.size(); ++i){
               num2 += '0';
           }
        } else if(a.size()<b.size()){
            for(int i=0; i<b.size()-a.size(); ++i){
                num1 += '0';
            }
        }
        
        int carry = 0;
        for(int i=0; i<num1.size(); ++i){
            int sum = carry + num1[i]-'0' + num2[i]-'0';
            carry = sum/2;
            result += to_string(sum&1);
        }
        if(carry > 0) result += '1';
        
        reverse(result.begin(), result.end());
        
        return result;
    }
};