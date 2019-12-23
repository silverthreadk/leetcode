class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int count = 0;
        vector<int> sorted_heights;
        sorted_heights.assign(heights.begin(), heights.end());
        sort(sorted_heights.begin(), sorted_heights.end());
        
        int n = heights.size();
        for(int i=0; i<n; ++i){
            if(heights[i] == sorted_heights[i]) continue;
            ++count;
        }
        return count;
    }
};