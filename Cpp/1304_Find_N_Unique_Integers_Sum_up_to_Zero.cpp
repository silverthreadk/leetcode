class Solution {
public:
    vector<int> sumZero(int n) {
        vector<int> result(n, 0);
        
        for(int i=0; i<n/2; ++i){
            result[i*2] = i+1;
            result[i*2+1] = -i-1;
        }
        
        return result;
    }
};