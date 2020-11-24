class Solution {
public:
    int numUniqueEmails(vector<string>& emails) {
        unordered_set<string> s;
        
        for(auto& email : emails){
            string local_name = "";
            int pos = 0;
            for(; pos<email.size(); ++pos){
                if(email[pos] == '+'){
                    while(email[pos] != '@') {
                        ++pos;
                    }
                    break;
                } else if(email[pos] == '@') {
                    break;
                } else if(email[pos] != '.') {
                    local_name += email[pos];
                }
            }
            
            s.insert(local_name + email.substr(pos));
        }
        
        return s.size();
    }
};