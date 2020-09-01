class Solution {
public:
    string reverseWords(string s) {
        string result = "";
        stack<string> word_stack;
        string word = "";
        
        for(auto& ch : s){
            if(ch == ' ') {
                if(word.empty()) continue;
                word_stack.push(word);
                word = "";
            } else {
                word += ch;
            }
        }
        
        if(!word.empty()) word_stack.push(word);
        
        if(word_stack.empty()) return "";
        
        while(!word_stack.empty()){
            result += word_stack.top() + ' ';
            word_stack.pop();
        }
        result.pop_back();
        
        return result;
    }
};