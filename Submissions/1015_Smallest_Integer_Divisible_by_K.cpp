class Solution {
public:
    int smallestRepunitDivByK(int K) {
        if(K%2 == 0 || K%5 == 0) return -1;
        int N = 1;
        for(int i = 1; ;++i){
            if(N%K == 0) return i;
            N = (N * 10 + 1) % K;
        }
        
        return -1;
    }
};