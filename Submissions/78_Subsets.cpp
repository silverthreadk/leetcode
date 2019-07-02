class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int> > result;
        const int n = nums.size();
        int subset_num = 1 << n;

        for(int i = 0; i < subset_num; ++i) {
            bitset<10> mask(i);
            vector<int> subset;
            for (int j = 0; j < n; ++j) {
                if(mask.test(j)) {
                    subset.push_back(nums[j]);
                }
            }
            result.push_back(subset);
        }
        
        return result;
    }
};