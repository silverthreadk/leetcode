class Solution {
public:
    bool hasAlternatingBits(int n) {
        int previous = n%2;
        int i = n/2;
        while(i>0){
            int remainder = i%2;
            if(previous==remainder) return false;
            previous = remainder;
            i=i/2;
        }
        return true;
    }
};