class Solution {
public:
    int leastInterval(vector<char>& tasks, int n) {
        map<char, int> frequencys;
        int max_frequency = 0;
        for(auto& task : tasks){
            max_frequency = max(max_frequency, ++frequencys[task]);
        }
        
        int remain = 0;
        for(auto& frequency: frequencys){
            if(frequency.second == max_frequency){
                ++remain;
            }
        }
        
        return max(static_cast<int>(tasks.size()), (n + 1) * (max_frequency - 1) + remain);
    }
};