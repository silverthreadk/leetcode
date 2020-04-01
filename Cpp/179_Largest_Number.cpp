class Solution {
public:
    string largestNumber(vector<int>& nums) {
        string result;
        vector<string> strings;
        
        for(auto& num : nums) {
            strings.push_back(to_string(num));
        }
        
        sort(strings.begin(), strings.end(),
             [](const string &str1, const string &str2)->bool{return str1+str2 > str2+str1;});
        
        if(strings[0] == "0") return strings[0];
        
        for(auto& iter : strings){
            result += iter;
        }
        
        return result;
    }
};