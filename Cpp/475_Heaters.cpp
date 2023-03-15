class Solution {
public:
    int findRadius(vector<int>& houses, vector<int>& heaters) {
        int result = 0;
        
        sort(heaters.begin(), heaters.end());
        
        for(auto& house : houses) {
            int radius = INT_MAX;
            auto heater = lower_bound(heaters.begin(), heaters.end(), house);

            if(heater != heaters.begin()){
                radius = abs(*(heater - 1) - house);
            }
            if(heater != heaters.end()){
                radius = min(radius, abs(*heater - house));
            }

            result = max(result, radius);
        }

        return result;
    }
};