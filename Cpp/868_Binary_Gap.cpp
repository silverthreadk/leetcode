class Solution {
public:
    int binaryGap(int N) {
        int result = 0;
        int current = N;
        int prev = -1;
        int i = 0;
        while(current != 0){
            if(current % 2 == 1) {
                result = prev == -1 ? 0 : max(result, i - prev);
                prev = i;
            }
            ++i;
            current /= 2;
        }
        
        return result;
    }
};