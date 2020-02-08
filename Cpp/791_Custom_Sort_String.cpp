class Solution {
public:
    string customSortString(string S, string T) {
        string result = "";
        map<char, int> frequencys;
        for(auto ch : T){
            frequencys[ch] +=1;
        }
        for(auto ch : S){
            for(int i=0; i<frequencys[ch]; ++i) result +=ch;
            frequencys.erase(ch);
        }
        for(auto frequency : frequencys){
            for(int i=0; i<frequency.second; ++i) result +=frequency.first;
        }
        return result;
    }
};