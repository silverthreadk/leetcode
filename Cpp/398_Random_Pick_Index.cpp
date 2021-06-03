class Solution {
public:
    Solution(vector<int>& nums) {
        for(int i = 0; i<nums.size(); ++i) {
            this->index[nums[i]].push_back(i);
        }
    }
    
    int pick(int target) {
        int count = index[target].size();
        return index[target][rand()%count];
    }
    
private:
    unordered_map<int, vector<int>> index;
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution* obj = new Solution(nums);
 * int param_1 = obj->pick(target);
 */