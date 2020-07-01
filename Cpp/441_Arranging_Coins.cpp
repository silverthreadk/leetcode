class Solution {
public:
    int arrangeCoins(int n) {
        int count = n;
        int i = 0;
        while(i<count){
            ++i;
            count -= i;
        }
        
        return i;
    }
};