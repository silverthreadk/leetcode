class Solution {
public:
    int twoCitySchedCost(vector<vector<int>>& costs) {
        int result = 0;
        int n = costs.size();
        vector<pair<int, int>> difference(n);
        for(int i=0; i<costs.size(); ++i){
            difference[i] = {costs[i][0]-costs[i][1], i};
        }
        sort(difference.begin(), difference.end());
        
        for(int i=0; i<n/2; ++i){
            result += costs[difference[i].second][0];
        }
        for(int i=n/2; i<n; ++i){
            result += costs[difference[i].second][1];
        }
        
        return result;
    }
};