class Solution {
public:
    int numTimesAllBlue(vector<int>& light) {
        int result = 0;
        int previous_index = 0;
        for(int i=0; i<light.size(); ++i) {
            previous_index = max(previous_index, light[i]);
            if (i + 1 == previous_index) {
                ++result;
            }
        }
        return result;
    }
};