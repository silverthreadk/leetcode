class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        map<int, int>freq;
        map<int, int>start;
        int max_degree = 1;
        int min_length = nums.size();
        for(int i = 0; i < nums.size(); ++i){
            if(freq[nums[i]] == 0){
                start[nums[i]] = i;
            }
            freq[nums[i]] +=1;
            if (freq[nums[i]] > max_degree) {
                max_degree = freq[nums[i]];
                min_length = i-start[nums[i]] + 1;
            } else if (freq[nums[i]] == max_degree) {
                min_length = min(min_length, i-start[nums[i]]+1);
            }
        }
        return min_length;
    }
};