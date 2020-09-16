class Solution {
public:
    int arrayNesting(vector<int>& nums) {
        int result = 0;
        vector<bool> visit(nums.size(), false);
        
        for(int i = 0; i<nums.size(); ++i){
            int count = 0;
            int j = i;
            while(!visit[j]){
                visit[j] = true;
                ++count;
                j = nums[j];
            }
            result = max(result, count);
        }
        
        return result;
    }
};