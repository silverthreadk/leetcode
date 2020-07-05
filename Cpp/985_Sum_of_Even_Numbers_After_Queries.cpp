class Solution {
public:
    vector<int> sumEvenAfterQueries(vector<int>& A, vector<vector<int>>& queries) {
        vector<int> result(queries.size());
        int sum_of_even = 0;
        for(auto& num : A){
            sum_of_even += num & 1 ? 0 : num;
        }
        
        for(int i=0; i<queries.size(); ++i){
            int index = queries[i][1];
            int num = A[index] + queries[i][0];
            if(!(num & 1)){
                sum_of_even += num;
            }
            if(!(A[index] & 1)){
                sum_of_even -= A[index];
            }
            A[index] += queries[i][0];
            result[i] += sum_of_even;
        }
        
        return result;
    }
};