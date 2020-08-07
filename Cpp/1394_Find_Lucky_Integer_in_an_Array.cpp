class Solution {
public:
    int findLucky(vector<int>& arr) {
        vector<int> frequency(501, 0);
        
        for(auto& num : arr){
            ++frequency[num];
        }
        
        for(int i = 500; i>=1; --i){
            if (i == frequency[i]) return i;
        }
        
        return -1;
    }
};