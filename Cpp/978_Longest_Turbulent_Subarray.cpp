class Solution {
public:
    int maxTurbulenceSize(vector<int>& A) {
        if (A.size() < 2) return A.size();
        int result = 0;
        int count = 0;
        int direction = 0;
        for(int i=1; i<A.size(); ++i){
            if(A[i-1] - A[i] == 0){
                count = 0;
                direction = 0;
            } else if(A[i-1] - A[i] > 0){
                count = direction < 0 ? count + 1 : 1;
                direction = 1;
            } else{
                count = direction > 0 ? count + 1 : 1;
                direction = -1;
            }
            result = max(result, count);
        }
        
        return result + 1;
    }
};