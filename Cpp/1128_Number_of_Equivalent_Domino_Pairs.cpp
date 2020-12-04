class Solution {
public:
    int numEquivDominoPairs(vector<vector<int>>& dominoes) {
        int result = 0;
        
        vector<vector<int>> visit(10, vector<int>(10));
        for(vector<int>& domino : dominoes) {
            int min_value = min(domino[0], domino[1]);
            int max_value = max(domino[0], domino[1]);
            result += visit[min_value][max_value]++;
        }
        
        return result;
    }
};