class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        bitset<32> b = n;
        int bit_size = b.size();
        for(int i=0; i<bit_size/2; ++i){
            int t = b[i];
            b[i] = b[bit_size-1-i];
            b[bit_size-1-i] = t;
        }
        
        return b.to_ulong();
    }
};