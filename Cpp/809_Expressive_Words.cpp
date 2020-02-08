class Solution {
public:
    int expressiveWords(string S, vector<string>& words) {
        int result = 0;
        int S_length = S.size();
        for(auto word : words){
            int word_length = word.size();
            if(S_length < word_length) continue;
            int i=0, j=0;
            for(; i<S.size(); ++i){
                if(S[i] == word[j]) ++j;
                else if(i>0 && S[i]==S[i-1] && i+1<S_length && S[i]==S[i+1]) ++i;
                else if(i>1 && S[i]==S[i-1] && S[i]==S[i-2]) continue;
                else break;
            }
            
            if(i==S_length && j==word_length) ++result;
        }
        return result;
    }
};