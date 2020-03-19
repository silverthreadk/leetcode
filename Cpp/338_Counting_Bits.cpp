class Solution {
public:
    vector<int> countBits(int num) {
        vector<int> result(num + 1, 0);
        if(num == 0) return result;
        
        result[1] = 1;
        int offset = 0;
        for(int i=2; i<=num; ++i){
            if((i & (i - 1)) == 0) {
                result[i] = 1;
                offset = i;
            } else {
                result[i] = 1 + result[i%offset];
            }
        }
        return result;
    }
};