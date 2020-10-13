class Solution {
public:
    string decodeAtIndex(string S, int K) {
        string decode = "";
        for(int i=0; i<S.size(); ++i){
            if(S[i]>='0' && S[i]<='9'){
                string temp = decode;
                for(int j=0; j<S[i]-'0'-1; ++j) decode += temp;
            } else {
                decode += S[i];
            }
            
            if(decode.size() >= K) return {decode[K-1]};
        }
        
        return "";
    }
};