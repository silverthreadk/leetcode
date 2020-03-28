class Solution {
public:
    int findPoisonedDuration(vector<int>& timeSeries, int duration) {
        int result = 0;
        if(timeSeries.empty()) return result;
        
        for(int i = 1; i<timeSeries.size(); ++i) {
            result += min(timeSeries[i] - timeSeries[i-1], duration);
        }
        result += duration;
        
        return result;
    }
};