class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        unordered_set<int> s;
        for(auto& num : arr){
            if((num % 2 == 0 && s.find(num/2) != s.end()) || s.find(num*2) != s.end()) return true;
            s.insert(num);
        }
        return false;
    }
};