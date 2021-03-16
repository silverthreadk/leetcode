class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        int result = 0;
        unordered_map<int, int> frequency;
        for(auto& num : nums){
            if(frequency.find(num) != frequency.end()){
                result -= frequency[num] * num;
                frequency[num] = 0;
                continue;
            }
            result += num;
            ++frequency[num];
        }        
        
        return result;
    }
};