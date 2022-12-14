class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {
        int n = sentence.size();
        int m = searchWord.size();
        int count = 0;

        for(int i = 0; i < n - m + 1; ++i){
            if(sentence[i]==' ') ++count;
            
            if((sentence.substr(i, m) == searchWord) && (i == 0 || sentence[i - 1] == ' ')) {
                return count + 1;
            }
        }

        return -1;
    }
};