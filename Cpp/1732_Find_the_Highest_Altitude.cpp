class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int result = 0;
        int altitude = 0;
        for(auto& n : gain) {
            altitude += n;
            result = max(result, altitude);
        }
        
        return result;
    }
};