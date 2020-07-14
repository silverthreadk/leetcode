class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& nums) {
        vector<int> result;
        vector<vector<int>> sum;
        for(int i=nums.size()-1; i>=0; --i){
            for(int j=0; j<nums[i].size(); ++j){
                if(i+j>=sum.size()) sum.resize(i+j+1);
                sum[i+j].push_back(nums[i][j]);
            }
        }
        
        for(auto& it : sum) {
            result.insert(result.end(), it.begin(), it.end());
        }
        
        return result;
    }
};