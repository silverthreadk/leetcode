class Solution {
public:
    vector<int> findRedundantConnection(vector<vector<int>>& edges) {
        vector<int> parents(1001);
        for(int i=0; i<parents.size(); ++i) {
            parents[i] = i;
        }
        
        for(auto edge : edges) {
            int v1 = find(parents, edge[0]);
            int v2 = find(parents, edge[1]);
            if (v1 == v2) return edge;
            parents[v1] = v2;
        }
        return {};
    }
    
    int find(vector<int>& parents, int x) {
        if(parents[x] != x) {
            parents[x] = find(parents, parents[x]);
        }
        return parents[x];
    }
};