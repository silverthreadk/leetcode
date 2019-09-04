class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> remainder;
        remainder[0] = -1;
        int sum = 0;
        int n = nums.size();
        for(int i=0 ; i<n; ++i){
            sum += nums[i];
            if(k != 0) sum = sum % k;
            if(remainder.find(sum) != remainder.end()){
                if(i - remainder[sum] > 1) return true;
            }else {
                remainder[sum] = i;
            }
        }
        return false;
    }
};
 