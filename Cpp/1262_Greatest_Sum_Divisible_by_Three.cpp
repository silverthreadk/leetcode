class Solution {
public:
    int maxSumDivThree(vector<int>& nums) {
        int sum = 0;
        int mod1 = 100000;
        int mod2 = 100000;
        for(auto& num : nums) {
            sum += num;
            
            if(num % 3 == 1) {
                mod2 = min(mod2, mod1+num);
                mod1 = min(mod1, num);
            } else if(num % 3 == 2){
                mod1 = min(mod1, mod2+num);
                mod2 = min(mod2, num);
            }
        }
        
        if(sum % 3 == 1) {
            return sum - mod1;
        } else if(sum % 3 == 2) {
            return sum - mod2;
        }
        
        return sum;
    }
};