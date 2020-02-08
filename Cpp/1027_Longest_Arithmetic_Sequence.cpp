class Solution {
public:
    int longestArithSeqLength(vector<int>& A) {
        unordered_map<int, unordered_map<int, int> > freq;
        int maximum = 0;
        for(int i=1; i<A.size(); ++i){
            for(int j=0; j<i; ++j){
                int diff = A[i]-A[j];
                if(freq[j][diff] != 0) freq[i][diff] = freq[j][diff] + 1;
                else freq[i][diff] = 2;
                maximum = max(maximum, freq[i][diff]);
            }
        }
        return maximum;
    }
};