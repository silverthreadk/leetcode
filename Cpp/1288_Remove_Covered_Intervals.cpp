class Solution {
public:
    int removeCoveredIntervals(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(), [](vector<int>& a, vector<int>& b){
            if(a[0] == b[0]) return a[1] > b[1];
            return a[0] < b[0];
        });

        int result = 1;
        int index = 0;
        
        for(int i = 1; i < intervals.size(); ++i){
            if(intervals[i][1] <= intervals[index][1]) continue;
            ++result;
            index = i;
        }

        return result;
    }
};