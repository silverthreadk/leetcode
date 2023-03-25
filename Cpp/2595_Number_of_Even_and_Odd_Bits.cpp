class Solution {
public:
    vector<int> evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int current = n;
        bool isEvenIndex = true;

        while(current) {
            if(current % 2 == 1) {
                if(isEvenIndex) ++even;
                else ++odd;
            }
            isEvenIndex = !isEvenIndex;
            current /= 2;
        }

        return { even, odd };
    }
};