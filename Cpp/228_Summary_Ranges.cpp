class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> result;
        if(nums.empty()) return result;
        
        int begin = nums[0];
        int end = begin;
        for(int i=1; i<nums.size(); ++i){
            if (nums[i] == nums[i-1] + 1){
                end = nums[i];
            } else {
                addRange(begin, end, &result);
                
                begin = nums[i];
                end = begin;
            }
        }
        addRange(begin, end, &result);
        
        return result;
    }
    
    void addRange(int begin, int end, vector<string>* result){
        if(begin == end){
            result->push_back(to_string(end));
        } else {
            string str = to_string(begin) + "->" + to_string(end);
            result->push_back(str);
        }
    }
};