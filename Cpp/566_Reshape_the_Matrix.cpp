class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& nums, int r, int c) {
        if (nums.size() * nums[0].size() != r*c) return nums;
        
        vector<vector<int>> result(r, vector<int>(c));
        int i=0;
        for(auto& row : nums){
            for(auto& col : row){
                result[i/c][i%c] = col;
                ++i;
            }
        }
        
        return result;
    }
};