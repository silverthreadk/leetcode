class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        vector<vector<int>> result;
        vector<int> interval = newInterval;

        for(int i = 0; i < intervals.size(); ++i){
            if(interval[0] > intervals[i][1]){
                result.push_back(intervals[i]);
            } else if(interval[1] < intervals[i][0]){
                result.push_back(interval);
                interval = intervals[i];
            } else if(interval[0] <= intervals[i][1] || interval[1] >= intervals[i][0]){
                interval[0] = min(interval[0], intervals[i][0]);
                interval[1] = max(interval[1], intervals[i][1]);
            }
        }
        result.push_back(interval);

        return result;
    }
};