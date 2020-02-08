class Solution {
public:
    int maxNumberOfBalloons(string text) {
        unordered_map<char, int> frequency;
        for(int i=0; i<text.size(); ++i){
            if(text[i] != 'b' && text[i] != 'a' && text[i] != 'l' && text[i] != 'o' && text[i] != 'n') continue;
            ++frequency[text[i]];
        }
        return min({frequency['b'], frequency['a'], frequency['l']/2, frequency['o']/2, frequency['n']});
    }
};