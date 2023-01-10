class Solution {
public:
    int numberOfSteps(int num) {
        int result = 0;
        int current = num;

        while(current != 0){
            if(current & 1) current -= 1;
            else current >>= 1;
            ++result;
        }

        return result;
    }
};