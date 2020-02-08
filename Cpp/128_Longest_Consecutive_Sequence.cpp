class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.empty()) return 0;
        if(nums.size() == 1) return 1;

        std::set<int> sorted;
        int count = 0;
        int result = 0;
        for(auto num : nums){
            sorted.insert(num);
        }
        auto last_num = std::prev(sorted.end());
        for(auto iter = sorted.begin(); iter != last_num; iter++){
            if ((*std::next(iter) - *iter) == 1) ++count;
            else {
                result = std::max(count + 1, result);
                count = 0;
            }
        }

        result = std::max(count + 1, result);
        
        return result;
    }
};