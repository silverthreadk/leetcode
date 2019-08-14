class Solution {
public:
    int mirrorReflection(int p, int q) {
        int g = gcd(p, q);
        int x = (p / g) % 2;
        int y = (q / g) % 2;
        
        if(x == 1 && y == 1) return 1;
        else if(x == 1) return 0;
        else return 2;
    }
};