class Solution {
public:
    vector<vector<int>> allCellsDistOrder(int R, int C, int r0, int c0) {
        vector<vector<int>> result;
        vector<vector<bool>> visit(R, vector<bool>(C, false));
        
        queue<pair<int, int>> q;
        q.push({r0, c0});
        
        while(!q.empty()){
            auto cell = q.front();
            q.pop();
            
            visit[cell.first][cell.second] = true;
            result.push_back({cell.first, cell.second});
            
            if(cell.first-1>=0 && !visit[cell.first-1][cell.second]) q.push({cell.first-1, cell.second});
            if(cell.first+1<R && !visit[cell.first+1][cell.second]) q.push({cell.first+1, cell.second});
            if(cell.second-1>=0 && !visit[cell.first][cell.second-1]) q.push({cell.first, cell.second-1});
            if(cell.second+1<C && !visit[cell.first][cell.second+1]) q.push({cell.first, cell.second+1});
        }
        
        return result;
    }
};