class Solution {
public:
    vector<int> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int x = (tomatoSlices - 2 * cheeseSlices) / 2;
        int y = (-tomatoSlices + 4 * cheeseSlices) / 2;
        if(x >= 0 && y >= 0 && (4*x + 2*y) == tomatoSlices && (x + y == cheeseSlices)){
            return {x, y};
        }
        
        return {};
    }
};