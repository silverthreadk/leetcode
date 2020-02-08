class Solution {
public:
    vector<int> constructRectangle(int area) {
        vector<int> result;
        int square_root = std::sqrt(area);
        for(int i = square_root; i>0; --i){
            if(area % i == 0) {
                result.push_back(area/i);
                result.push_back(i);
                break;
            }
        }
        return result;   
    }
};