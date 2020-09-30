class Solution {
public:
    int calPoints(vector<string>& ops) {
        vector<int> s;
        
        for(auto& ch : ops){
            if(ch == "+"){
                s.push_back(s.back() + s[s.size()-2]);
            } else if(ch == "C"){
                s.pop_back();
            } else if(ch == "D"){
                s.push_back(s.back()*2);
            } else {
                s.push_back(stoi(ch));
            }
        }
        
        return accumulate(s.begin(), s.end(), 0);
    }
};