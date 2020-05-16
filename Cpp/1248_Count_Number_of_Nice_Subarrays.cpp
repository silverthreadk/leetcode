class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        int result = 0;
        int odd = 0;
        unordered_map<int, int> count;
        count[0] = 1;
        for(int i=0; i<nums.size(); ++i){
            odd += nums[i] % 2;
            if(count.find(odd - k) != count.end()){
                result += count[odd - k];
            }
            ++count[odd];
        }
        
        return result;
    }
};