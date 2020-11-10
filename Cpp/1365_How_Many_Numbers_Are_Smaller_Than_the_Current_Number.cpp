class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> result(nums.size());
        map<int, int> count;
        for(auto& num : nums){
            ++count[num];
        }
        
        int sum = 0;
        for(auto& it : count){
            int temp = it.second;
            it.second = sum;
            sum += temp;
        }
        
        for(int i=0; i<nums.size(); ++i){
            result[i] = count[nums[i]];
        }
        
        return result;
    }
};