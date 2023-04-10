class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        set<string> s;
        vector<string> morse_code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(auto& word : words){
            string converted = "";
            for(auto& ch : word){
                converted += morse_code[ch - 'a'];
            }
            s.insert(converted);
        }
        
        return s.size();
    }
};