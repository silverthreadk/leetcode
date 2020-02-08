class Solution {
public:
    bool validMountainArray(vector<int>& A) {
        if(A.size() <3) return false;
        bool ascending = true;
        for(int i=1; i<A.size(); ++i){
            if(A[i] > A[i-1]) {
                if(!ascending) return false;
            } else if(A[i] < A[i-1]) {
                if(i==1) return false;
                ascending = false;
            } else {
                return false;
            }
        }
        
        return !ascending;
    }
};