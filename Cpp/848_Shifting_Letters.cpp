class Solution {
public:
    string shiftingLetters(string S, vector<int>& shifts) {
        string result="";
        int n = shifts.size();
        vector<int> shift_sum(n, 0);
        shift_sum[n-1] = shifts[n-1] % 26;
        for(int i=n-2; i>=0; --i){
            shift_sum[i] += (shift_sum[i+1] + shifts[i]) % 26;
        }
        
        for(int i=0; i<n; ++i){
            result += 'a' + (S[i]-'a' + shift_sum[i]) % 26;
        }
        
        return result;
    }
};