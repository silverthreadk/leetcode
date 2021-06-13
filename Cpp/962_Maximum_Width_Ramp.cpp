class Solution {
public:
    int maxWidthRamp(vector<int>& nums) {
        int result = 0;
        int n=nums.size();
        vector<int> left(n, nums[0]);
        vector<int> right(n, nums[n-1]);
        
        for(int i=1; i<n; ++i) {
            left[i] = min(left[i-1], nums[i]);
        }

        for(int i=n-2; i>=0; --i) {
            right[i]=max(right[i+1], nums[i]);
        }
        
        int i=0, j=0;
        while(j<n) {
            if(left[i] <= right[j]) {
                result = max(result, j-i);
                ++j;

            } else {
                ++i;
            }
        }
        
        return result;
    }
};