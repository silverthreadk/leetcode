class Solution {
public:
    string decodeString(string s) {
        stack<int> num_stack;
        stack<string> word_stack;
        string word = "";
        int num = 0;
        
        for(auto& ch : s){
            if(isdigit(ch)){
                num = num * 10 + ch - '0';
            }else if(ch == '['){
                word_stack.push(word);
                num_stack.push(num);
                num = 0;
                word = "";
            }else if(ch == ']'){
                int n = num_stack.top();
                string temp = word; 
                for(int i=0; i<n-1; ++i){
                    word += temp;
                }
                
                word = word_stack.top() + word;
                word_stack.pop();
                num_stack.pop();
            }else {
                word += ch;
            }
        }
        
        return word;
    }
};