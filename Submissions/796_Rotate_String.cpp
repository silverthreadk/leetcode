class Solution {
public:
    bool rotateString(string A, string B) {
        if(A.length() != B.length()) return false;
        if(A.empty()) return true;
        
        int n = A.length();
        int pos = 0;
        while((pos = A.find(B[0], pos+1)) != string::npos){
            int i=0;
            for(; i<n; ++i){
                if(A[(pos+i)%n] != B[i]) {
                    break;
                }
            }
            if(i==n) return true;
        }
        
        return false;
    }
};