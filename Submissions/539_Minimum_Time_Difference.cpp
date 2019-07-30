class Solution {
public:
    int findMinDifference(vector<string>& timePoints) {
        sort(timePoints.begin(), timePoints.end());
        
        int n = timePoints.size();
        int prev = getMinute(timePoints[n-1]);
        int curr = getMinute(timePoints[0]);
        int result = std::min(prev-curr, curr+24*60-prev);
        prev = curr;
        for(int i=1; i<n; ++i) {
            curr = getMinute(timePoints[i]);
            result = std::min(result, curr-prev);
            prev = curr;
        }
        
        return result;
    }
    
    int getMinute(const string& time){
        return (time[0] - '0') * 10 * 60 + (time[1] - '0') * 60 + (time[3] - '0') * 10 + (time[4] -'0'); 
    }
};