class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& coordinates) {
        if(coordinates.size()<2) return true;

        for(int i=2; i<coordinates.size(); ++i){
            if(getDiffX(coordinates[i], coordinates[i-1]) * getDiffY(coordinates[i-1], coordinates[i-2])
               != getDiffY(coordinates[i], coordinates[i-1]) * getDiffX(coordinates[i-1], coordinates[i-2])) return false;
        }
        
        return true;
    }
    
    float getDiffX(vector<int> p1, vector<int> p2){
        return p1[0] - p2[0];
    }
    
    float getDiffY(vector<int> p1, vector<int> p2){
        return p1[1] - p2[1];
    }
};