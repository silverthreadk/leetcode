class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int n = nums.size();
        vector<bool> visit(n+1, false);
        for(auto& num : nums){
            if(num < 0 || num > n) continue;
            visit[num] = true;
        }
        
        for(int i=1; i<visit.size(); ++i){
            if(!visit[i]) return i;
        }
        
        return n+1;
    }
};