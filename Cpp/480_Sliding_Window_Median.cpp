class Solution {
public:
    vector<double> medianSlidingWindow(vector<int>& nums, int k) {
        vector<double> result;
        multiset<int> sorted;
        
        for(int i = 0; i<k; ++i){
            sorted.insert(nums[i]);
        }
        
        auto median = sorted.begin();
        std::advance(median, k/2);
        
        bool isEven = k%2 == 0;
        int size = nums.size();
        for(int i=k; ; ++i){
            if(isEven){
                auto median2 = std::prev(median, 1);
                result.push_back(((double)(*median) + *median2)/2);
            } else {
                result.push_back(*median);
            }
            
            if(i == size) break;
            
            sorted.insert(nums[i]);
            
            if(nums[i] < *median) median--;

            if(nums[i-k] <= *median) median++;
            
            auto it = sorted.find(nums[i-k]);
            sorted.erase(it);
        }
        
        return result;
    }
};