class Solution {
public:
    int tribonacci(int n) {
        if(n == 0) return 0;
        if(n < 3) return 1; 
        
        vector<int> t(4, 0);
        t[1] = 1;
        t[2] = 1;
        for(int i=3; i<=n; ++i){
            t[3] = t[2] + t[1] + t[0];
            t[0] = t[1];
            t[1] = t[2];
            t[2] = t[3];
        }
        
        return t[3];
    }
};