class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int, int> start;
        int result = 0;
        int sum = 0;
        start[0] = -1;
        for(int i=0; i<nums.size(); ++i){
            sum += nums[i] == 1 ? 1 : -1; 
            auto found = start.find(sum);
            if (found != start.end()){
                result = std::max(result, i - found->second);
            } else {
                start[sum] = i;
            }
        }
        
        return result;
    }
};