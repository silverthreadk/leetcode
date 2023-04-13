class Solution {
public:
    int passThePillow(int n, int time) {
        int passing_count = time / (n - 1);
        int remainder = time % (n - 1);
        
        if(passing_count % 2 == 0) return remainder + 1;
        else return n - remainder;
    }
};