class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int result = 0;
        int consecutive_count = 0;
        for(auto& num : nums){
            if(num == 1){
                ++consecutive_count;
            } else {
                result = max(result, consecutive_count);
                consecutive_count = 0;
            }
        }
        result = max(result, consecutive_count);
        
        return result;
    }
};