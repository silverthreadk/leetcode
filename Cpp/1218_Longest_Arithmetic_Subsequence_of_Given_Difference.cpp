class Solution {
public:
    int longestSubsequence(vector<int>& arr, int difference) {
        int result = 1;
        unordered_map<int, int> count;
        for(auto& num : arr){
            if(count.find(num-difference) == count.end()){
                count[num] = 1;
            } else{
                count[num] = count[num-difference] + 1;
                result = max(result, count[num]);
            }
        }
        return result;
    }
};