class Solution {
public:
    bool hasGroupsSizeX(vector<int>& deck) {
        unordered_map<int, int> m;

        for(int i = 0; i < deck.size(); ++i){
            ++m[deck[i]];
        }

        int g = m[deck[0]];
        for(int i = 1; i < deck.size(); ++i) {
            g = gcd(g, m[deck[i]]);
        }

        return g > 1;
    }
};