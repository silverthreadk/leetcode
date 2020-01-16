class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int l = 0, r = nums.size()-1, mid = (l+r)/2;
        while(l<r) {
            mid = (l+r)/2;
            if(nums[mid] == nums[mid+1]) {
                if(mid%2==0) l = mid;
                else r = mid-1;
            } else if(nums[mid] == nums[mid-1]) {
                if(mid%2==0) r = mid;
                else l = mid+1;
            } else {
                l = r = mid;
                break;
            }

        }
        return nums[l];
    }
};