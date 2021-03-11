class Solution {
public:
    int countPrimes(int n) {
        int result = 0;
        vector<bool> prime(n+1, true);
        for(int i=2; i<n; ++i){
            if(!prime[i]) continue;
            for(int j=2; j*i<=n; ++j){
                prime[i*j] = false;
            }
        }
        
        for(int i=2; i<n; ++i){
            if(prime[i]) ++result;
        }
    
        return result;
    }
};