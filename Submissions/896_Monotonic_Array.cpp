class Solution {
public:
    bool isMonotonic(vector<int>& A) {
        bool increasing = false;
        bool decreasing = false;
        for(int i=1; i<A.size(); ++i){
            if(A[i]-A[i-1] == 0) continue;
            else if(A[i]-A[i-1]>0) increasing = true;
            else decreasing = true;
            
            if(increasing && decreasing) return false;
        }
        
        return true;
    }
};