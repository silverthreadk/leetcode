class Solution {
public:
    vector<int> diStringMatch(string S) {
        vector<int> result;
        int N = S.size();
        int lo = 0;
        int hi = N;
        
        for(int i=0; i<N; ++i){
            if(S[i] == 'I') {
                result.push_back(lo);
                ++lo;
            } else {
                result.push_back(hi);
                --hi;
            }
        }
        result.push_back(lo);
        
        return result;
    }
};