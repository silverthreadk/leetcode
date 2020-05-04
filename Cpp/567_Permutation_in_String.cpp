class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if(s1.size() > s2.size()) return false;
        vector<int> s1_frequency(26, 0);
        vector<int> s2_frequency(26, 0);    

        for(int i=0; i<s1.size(); ++i){
            ++s1_frequency[s1[i]-'a'];
            ++s2_frequency[s2[i]-'a'];
        }
        
        int equal_count = 0;
        for(int i=0; i<26; ++i){
            if(s1_frequency[i] == s2_frequency[i]) ++equal_count;
        }
        
        for(int i=s1.size(); i<s2.size(); ++i){
            if(equal_count == 26) return true;
            
            int left = s2[i]-'a';
            int right = s2[i-s1.size()]-'a';
            
            if(s1_frequency[left] == s2_frequency[left]){
                --equal_count;
            }
            if(s1_frequency[right] == s2_frequency[right]){
                --equal_count;
            }
            
            ++s2_frequency[left];
            --s2_frequency[right];
            
            if(s1_frequency[left] == s2_frequency[left]){
                ++equal_count;
            }
            if(s1_frequency[right] == s2_frequency[right]){
                ++equal_count;
            }
            
        }
        
        return equal_count == 26;
    }
};