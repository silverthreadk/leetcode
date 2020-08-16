class Solution {
public:
    vector<int> fairCandySwap(vector<int>& A, vector<int>& B) {
        int sum_a = accumulate(A.begin(), A.end(), 0);
        int sum_b = accumulate(B.begin(), B.end(), 0);
        int difference = (sum_b - sum_a) / 2;
        
        unordered_set<int> s;
        for(auto& it : A){
            s.insert(it + difference);
        }
        for(auto& it : B){
            if(s.find(it) != s.end()) return {it-difference, it};
        }
        
        return {};
    }
};