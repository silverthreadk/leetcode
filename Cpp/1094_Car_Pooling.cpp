class Solution {
public:
    bool carPooling(vector<vector<int>>& trips, int capacity) {
        vector<int> time(1001, 0);
        int seats = 0;
        
        for(auto& trip: trips){
            time[trip[1]] += trip[0];
            time[trip[2]] -= trip[0];
        }
        
        for(auto& t : time){
            seats += t;
            if(seats > capacity) return false;
        }
        
        return true;
    }
};