class Solution {
public:
    string defangIPaddr(string address) {
        string result = "";
        
        for(auto& ch : address) {
            if(isdigit(ch)) {
                result.push_back(ch);
            } else {
                result.push_back('[');
                result.push_back('.');
                result.push_back(']');
            }
        }
        
        return result; 
    }
};