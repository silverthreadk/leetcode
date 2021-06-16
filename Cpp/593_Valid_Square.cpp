class Solution {
public:
    bool validSquare(vector<int>& p1, vector<int>& p2, vector<int>& p3, vector<int>& p4) {
        unordered_map<int, int> m;
        ++m[getDistance(p1, p2)];
        ++m[getDistance(p1, p3)];
        ++m[getDistance(p1, p4)];
        ++m[getDistance(p2, p3)];
        ++m[getDistance(p2, p4)];
        ++m[getDistance(p3, p4)];
        
        if(m.size() != 2) return false;
        for(auto& it : m) {
            if(it.first == 0) return false;
            if(it.second == 4) return true;
        }
        
        return false;
    }
    
    int getDistance(vector<int> a, vector<int> b) {
        int x = a[0] - b[0];
        int y = a[1] - b[1];
        return x * x + y * y; 
    }
};