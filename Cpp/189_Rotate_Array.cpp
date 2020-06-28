class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int right_index = k % nums.size();
        
        std::rotate(nums.rbegin(), nums.rbegin() + right_index, nums.rend());
    }
};