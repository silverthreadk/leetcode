class Solution {
public:
    bool threeConsecutiveOdds(vector<int>& arr) {
        int odd_count = 0;
        for(auto& it : arr){
            if(it&1 == 1) ++odd_count;
            else odd_count = 0;
            if(odd_count == 3) return true;
        }
        
        return false;
    }
};