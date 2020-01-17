class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        vector<int> result;
        unordered_map<int, int> frequency;
        for(auto& num : nums1) {
            ++frequency[num];
        }
        for(auto& num : nums2) {
            if(frequency[num] == 0) continue;
            --frequency[num];
            result.push_back(num);
        }
        
        return result;
    }
};