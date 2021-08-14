class Solution {
public:
    string reformatNumber(string number) {
        string result;
        
        int count = 0;
        for(auto& ch : number) {
            if (ch < '0' || ch > '9') continue;
            result += ch;
            ++count;
            
            if(count % 3 == 0) result += '-';
        }
        
        if(result.back() == '-') {
            result.pop_back();
        } else if(result[result.size() - 2] == '-') {
            swap (result[result.size() - 2], result[result.size() - 3]);
        }
        
        return result;
    }
};