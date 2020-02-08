class Solution {
public:
    string removeDuplicates(string S) {
        string result;
        for(auto& ch : S){
            if(result.empty() || ch != result.back()) {
                result.push_back(ch);
            } else {
                result.pop_back();
            }
        }

        return result;
    }
};