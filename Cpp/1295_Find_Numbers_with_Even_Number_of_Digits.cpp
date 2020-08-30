class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int result = 0;
        for(auto& num : nums){
            if((to_string(num).size() & 1) == 0) ++result;
        }
        
        return result;
    }
};