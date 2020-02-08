class Solution {
public:
    int hammingDistance(int x, int y) {
        int result = 0;
        bitset<32> b(x^y);
       
        for(int i=0; i<b.size(); ++i){
            if(b[i]==1) ++result;
        }
        
        return result;
    }
};