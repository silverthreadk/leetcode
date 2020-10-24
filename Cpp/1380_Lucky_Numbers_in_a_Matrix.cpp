class Solution {
public:
    vector<int> luckyNumbers (vector<vector<int>>& matrix) {
        vector<int> result;
        int m = matrix.size();
        int n = matrix[0].size();
        
        for(int i=0; i<m; ++i){
            int minimum = INT_MAX;
            int index = 0;
            for(int j=0; j<n; ++j){
                if(minimum > matrix[i][j]){
                    minimum = matrix[i][j];
                    index = j;
                }
            }
            int maximum = minimum;
            for(int j=0; j<m; ++j){
                maximum = max(maximum, matrix[j][index]);
            }
            
            if(minimum == maximum){
                result.push_back(minimum); 
            }
        }
        
        return result;
    }
};