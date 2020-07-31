class Solution {
public:
    int findLongestChain(vector<vector<int>>& pairs) {
        int result = 1;
        sort(pairs.begin(), pairs.end(), [](vector<int> a, vector<int> b){
            if(a[1] == b[1]) return a[0] < b[0];
            return a[1] < b[1];
        });
        
        int current = pairs[0][1];
        for(auto& pair : pairs){
            if(current >= pair[0]) continue;
            current = pair[1];
            ++result;
        }
        
        return result;
    }
};