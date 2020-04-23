class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int result = 0;
        unordered_map<int, int> sum_count;
        sum_count[0] = 1;
        int sum = 0;
        for (int i = 0; i < nums.size(); ++i) {
            sum += nums[i];
            auto found = sum_count.find(sum - k);
            if(found != sum_count.end()){
                result += found->second;
            }
            ++sum_count[sum];
        }

        return result;
    }
};