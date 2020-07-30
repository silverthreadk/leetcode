class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> result(rowIndex+1);
        result[0] = 1;
        result[rowIndex] = 1;
        for(int i=0; i<=rowIndex; ++i){
            result[i] = 1;
            for(int j=i-1; j>0; --j){
                result[j] = result[j-1] + result[j];
            }
        }
        
        return result;
    }
};