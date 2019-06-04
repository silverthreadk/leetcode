class Solution {
public:
    int nthMagicalNumber(int N, int A, int B) {
        int LCM = std::lcm(A,B);
        long magical_number_count = LCM / A + LCM / B - 1;
        
        long lo = N / magical_number_count * LCM;
        long hi = lo + LCM;
        long mi = 0;

        while(true) {
            mi = (hi + lo) / 2;
            magical_number_count = mi / A + mi / B - mi / LCM;
            
            if (magical_number_count > N) hi = mi;
            else if(magical_number_count < N) lo = mi + 1;
            else break;
        }
        
        return (mi - std::min(mi % A, mi % B)) % static_cast<int>(1e9 + 7);
    }
};