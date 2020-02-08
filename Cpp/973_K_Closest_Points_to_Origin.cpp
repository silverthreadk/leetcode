class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int K) {
        vector<vector<int> > result;
        priority_queue<pair<int, int>, vector<pair<int, int> >, greater<pair<int, int> > > q;
        
        for(int i=0; i<points.size(); ++i){
            q.push({points[i][0]*points[i][0] + points[i][1]*points[i][1], i});
        }
        
        for(int i=0; i<K; ++i){
            auto closest_point = q.top();
            result.push_back(points[closest_point.second]);
            q.pop();
        }
        return result;
    }
};