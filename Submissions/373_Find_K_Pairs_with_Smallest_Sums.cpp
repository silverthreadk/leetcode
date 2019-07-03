class Solution {
public:
    vector<vector<int>> kSmallestPairs(vector<int>& nums1, vector<int>& nums2, int k) {
        vector<vector<int> > result;
        int n = std::min(k, static_cast<int>(nums1.size()*nums2.size()));
        if(n == 0) return result;
        
        int max_sum = nums1.back() + nums2.back();
        vector<int> index(nums1.size(), 0);
        int next = 0;
        for(int i = 0; i < n; ++i) {
            int min_sum = max_sum;
            int u = 0;

            for(int j = 0; j < nums1.size(); ++j) {
                if (index[j] < nums2.size() && min_sum >= nums1[j] + nums2[index[j]]) {
                    min_sum = nums1[j] + nums2[index[j]];
                    u = j;
                }
                if (index[j] == next) break;
            }
            vector<int> pair;
            pair.push_back(nums1[u]);
            pair.push_back(nums2[index[u]]);
            result.push_back(pair);

            ++index[u];
            if(u == nums1.size() -1) ++next;
        }
        
        return result;
    }
};