class Solution {
public:
    int findClosestNumber(vector<int>& nums) {
        int result = INT_MAX;

        for(auto& num :  nums){
            if(abs(num) < abs(result)){
                result = num;
            } else if(abs(num) == abs(result)){
                result = max(result, num);
            }
        }

        return result;
    }
};