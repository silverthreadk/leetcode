class Solution {
public:
    int searchFirstPosition(vector<int> &nums, int target){
        int lo = 0;
        int hi = nums.size();
        
        while(lo < hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] < target) {
                lo = mid+1;
            }else {
                hi = mid;
            }
        }
        return lo;
    }
    
    int searchLastPosition(vector<int> &nums, int target){
        int lo = 0;
        int hi = nums.size();
        
        while(lo < hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] <= target) {
                lo = mid+1;
            }else {
                hi = mid;
            }
        }
        
        return lo - 1;
    }
    
    vector<int> searchRange(vector<int>& nums, int target) {
        int first = searchFirstPosition(nums, target);
        int last = searchLastPosition(nums, target);
        
        if(first == nums.size() || nums[first] != target) {
            return {-1, -1};
        }
        
        return {first, last};
    }
};