class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int positve = 0;
        int negative = 0;

        for(auto& num : nums) {
            if(num > 0) ++positve;
            else if(num < 0) ++negative;
        }

        return max(positve, negative);
    }
};