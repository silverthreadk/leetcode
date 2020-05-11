class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        vector<int> result;
        unordered_map<int, int> rank;
        
        vector<int> sorted(arr);
        sort(sorted.begin(), sorted.end());
        
        int i = 1;
        for(auto& num : sorted){
            if(rank[num] == 0){
                rank[num] = i;
                ++i;
            }
        }
        
        for(auto& num : arr){
            result.push_back(rank[num]);
        }
        
        return result;
    }
};