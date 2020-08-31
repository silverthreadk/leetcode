class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> result;
        unordered_set<int> s(nums1.begin(), nums1.end());

        for(auto& num : nums2){
            if(s.count(num) == 0) continue;
            s.erase(num);
            result.push_back(num);
        }
        
        return result;
    }
};