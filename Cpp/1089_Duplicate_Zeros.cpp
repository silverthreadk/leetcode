class Solution {
public:
    void duplicateZeros(vector<int>& arr) {
        vector<int> duplicate(arr.size(), 0);
        
        for(int i=0, j=0; j<arr.size(); ++i, ++j){
            duplicate[j] = arr[i];
            if(!arr[i] && j+1<arr.size()){
                ++j;
                duplicate[j] = 0;
            }
        }
        
        arr = duplicate;
    }
};