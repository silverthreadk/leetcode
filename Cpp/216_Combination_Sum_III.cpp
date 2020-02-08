class Solution {
public:
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<vector<int> > result;
        vector<int> combination;
        dfs(k, n, 1, combination, result);
        return result;
    }
    
    void dfs(int k, int n, int start, vector<int>& combination, vector<vector<int>>& result){
        if(k == 0 && n == 0) {
            result.push_back(combination);
        }else if(k <=0 || n <=0) {
            return;
        }
        for(int i=start; i<10; ++i){
            combination.push_back(i);
            dfs(k-1, n-i, i+1, combination, result);
            combination.pop_back();
        }
    }
};