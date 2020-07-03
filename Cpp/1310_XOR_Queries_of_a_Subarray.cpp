class Solution {
public:
    vector<int> xorQueries(vector<int>& arr, vector<vector<int>>& queries) {
        vector<int> result(queries.size());
        vector<int> pre(arr.size());
        pre[0] = arr[0];
        for(int i=1; i<arr.size(); ++i){
            pre[i] = pre[i-1] ^ arr[i];
        }
        
        for(int i=0; i<queries.size(); ++i){
            if(queries[i][0] == 0) {
                result[i] = pre[queries[i][1]];
            }else {
                result[i] = pre[queries[i][0]-1] ^ pre[queries[i][1]];
            }
        }
        
        return result;
    }
};