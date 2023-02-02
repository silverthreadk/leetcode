class Solution {
public:
    int numDifferentIntegers(string word) {
        unordered_set<string> s;
        string num = "";

        for(int i = 0; i < word.size(); ++i) {
            if(word[i] == '0' && num.empty() && i < word.size() - 1 && isdigit(word[i + 1])) continue;

            if(isdigit(word[i])) {
                num += word[i];
            } else if(i > 0 && isdigit(word[i - 1])) {
                s.insert(num);
                num = "";
            }
        }

        if(isdigit(word.back())) s.insert(num);

        return s.size();
    }
};