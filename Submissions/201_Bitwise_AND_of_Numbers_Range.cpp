class Solution {
public:
    int rangeBitwiseAnd(int m, int n) {
        int begin = m, end = n, i = 0;
        while(begin != end){
            begin = begin >> 1;
            end = end >> 1;
            ++i;
        }
        return begin << i;
    }
};