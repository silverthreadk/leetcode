class Solution {
public:
    int findMinFibonacciNumbers(int k) {
        int result = 0;
        vector<int> fi(2, 1);
        
        for(int i=2; i<=k && fi[i-1]<k; ++i){
            fi.push_back(fi[i-1] + fi[i-2]);
        }
        
        int n = k;
        for(int i=fi.size()-1; i>=0; --i){
            if(n-fi[i]>=0){
                n-=fi[i];
                ++result;
            }
        }
        
        return result;
    }
};