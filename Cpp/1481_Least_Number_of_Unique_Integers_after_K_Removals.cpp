class Solution {
public:
    int findLeastNumOfUniqueInts(vector<int>& arr, int k) {
        unordered_map<int,int> m;
        multiset<int> s;
        for(auto& num : arr) {
            m[num] += 1;
        }
        
        for(auto& it : m) {
            s.insert(it.second);
        }
        
        int result = s.size(); 
        int i = k;
        for(auto& it : s) {
            if(it > i) break;
            else i -= it;
            --result;
        }
        
        return result;
    }
};