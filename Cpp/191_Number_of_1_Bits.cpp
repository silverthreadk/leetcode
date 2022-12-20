class Solution {
public:
    int hammingWeight(uint32_t n) {
        int result = 0;
        uint32_t current = n;

        while(current != 0){
            result += current & 1;
            current = current >> 1;    
        }

        return result;
    }
};