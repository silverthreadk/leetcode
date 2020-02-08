class Solution {
public:
    int findUnsortedSubarray(vector<int>& nums) {
        vector<int> sort_nums;
        sort_nums.assign(nums.begin(), nums.end());
        sort(sort_nums.begin(), sort_nums.end());
        
        int left = nums.size();
        int right = 0;
        for(int i=0; i<nums.size(); ++i){
            if(sort_nums[i] != nums[i]){
                left = min(left, i);
                right = max(right, i);
            }
        }
        return std::max(right - left + 1, 0);
    }
};