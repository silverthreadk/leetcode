class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> result;
        if(s.size()<p.size()) return result;
        
        vector<int> v1(26, 0);
        vector<int> v2(26, 0);
        
        for(int i=0; i<p.size(); ++i){
            ++v1[s[i]-'a'];
            ++v2[p[i]-'a'];
        }
        
        if(equal(v1, v2)){
            result.push_back(0);
        }
        
        for(int i=p.size(); i<s.size(); ++i){
            ++v1[s[i]-'a'];
            --v1[s[i-p.size()]-'a'];
            
            if(equal(v1, v2)){
                result.push_back(i-p.size()+1);
            }
        }
        
        return result;
    }
    
    bool equal(const vector<int>& v1, const vector<int>& v2) const{
        for(int i=0; i<26; ++i){
            if(v1[i] != v2[i]) return false;
        }
        
        return true;
    }
};