class Solution {
public:
    vector<int> shortestToChar(string S, char C) {
        int n = S.size();
        vector<int> result(n, n);
        int prev = -n;

        for(int i=0; i<n; ++i){
            if(S[i] == C) prev = i;
            result[i] = i-prev;
        }
        
        prev = 2*n;
        for(int i=n-1; i>=0; --i){
            if(S[i] == C) prev = i;
            result[i] = min(result[i], prev-i);
        }
        
        return result;
    }
};