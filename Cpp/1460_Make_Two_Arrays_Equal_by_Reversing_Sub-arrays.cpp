class Solution {
public:
    bool canBeEqual(vector<int>& target, vector<int>& arr) {
        vector<int> frequencys(1001, 0);
        for(int i=0; i<target.size(); ++i){
            ++frequencys[target[i]];
            --frequencys[arr[i]];
        }
        
        for(auto& frequency : frequencys){
            if(frequency != 0) return false;
        }
        
        return true;
    }
};