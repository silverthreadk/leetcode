class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        vector<int> result(k);
        priority_queue<pair<int,int>> pq;
        
        for(int i=0; i<mat.size(); ++i){
            int count = 0;
            for(int j=0; j<mat[0].size(); ++j){
                if(mat[i][j] == 0) break;
                ++count;
            }
            pq.push({count, i});
            if(pq.size() > k) pq.pop();
        }
        
        for(int i=k-1; i>=0; --i){
            result[i] = pq.top().second;
            pq.pop();
        }
        
        return result;
    }
};