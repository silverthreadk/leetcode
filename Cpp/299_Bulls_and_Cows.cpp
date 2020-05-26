class Solution {
public:
    string getHint(string secret, string guess) {
        int bulls = 0;
        int count[10] = {0};
        for(int i=0; i<secret.size(); ++i){
            if(secret[i]==guess[i]) ++bulls;
            else {
                count[secret[i]-'0'] += 1;
                count[guess[i]-'0'] -=1;
            }
        }
        
        int wrong = 0;
        for(int i=0; i<10; ++i){
            wrong += max(count[i], 0);
        }
        
        return to_string(bulls) + "A" + to_string(secret.size()-bulls-wrong) + "B";
    }
};