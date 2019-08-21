class Solution {
public:
    vector<vector<string>> findDuplicate(vector<string>& paths) {
        vector<vector<string> > result;
        map<string, vector<string> > m;
        for(auto path : paths) {
            int pos = path.find(' ');
            string directory = path.substr(0, pos);
            ++pos;
            while(pos < path.length()) {
                int next_pos = path.find('(', pos);
                string filename = path.substr(pos, next_pos-pos);
                pos = next_pos;
                
                next_pos = path.find(')', pos);
                string content = path.substr(pos, next_pos-pos);
                pos = next_pos + 2;
               
                m[content].push_back(directory + "/" + filename);
            }
        }
        
        for(auto iter=m.begin(); iter!=m.end(); ++iter) {
            if(iter->second.size() > 1) result.push_back(iter->second);
        }
        
        return result;
    }
};