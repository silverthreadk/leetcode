class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int sum = 0;
        int minimum = 0;
        for(auto& num: nums) {
            sum += num;
            minimum = min(minimum, sum);
        }
        
        return -minimum + 1;
    }
};