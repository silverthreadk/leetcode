class Solution {
public:
    char repeatedCharacter(string s) {
        vector<bool> v(26);
        for(auto& ch : s){
            if(v[ch - 'a']) return ch;

			v[ch - 'a'] = true;
        }

        return 0;
    }
};