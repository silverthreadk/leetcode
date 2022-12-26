class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> result(nums.size());
        int left = 0;
        int right = nums.size() - 1;
        
        for(int i = nums.size() - 1; i >= 0; --i){
            if(abs(nums[left]) < abs(nums[right])) {
                result[i] = nums[right] * nums[right--];
            } else {
                result[i] = nums[left] * nums[left++];
            }
        }
        
        return result;
    }
};