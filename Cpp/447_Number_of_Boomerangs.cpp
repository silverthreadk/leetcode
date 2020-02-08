class Solution {
public:
    int numberOfBoomerangs(vector<vector<int>>& points) {
        int result = 0;
        int n = points.size();
        for(int i=0; i<n; ++i){
            unordered_map<int, int> frequencys;
            for(int j=0; j<n; ++j){
                if(i==j) continue;
                int x = points[i][1]-points[j][1];
                int y = points[i][0]-points[j][0];
                int distance = x*x + y*y;
                frequencys[distance] += 1;
            }
            for(auto frequency : frequencys){
                result += (frequency.second * (frequency.second-1));
            }
        }
        return result;
    }
};