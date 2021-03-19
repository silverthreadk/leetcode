class Solution {
public:
    bool isPathCrossing(string path) {
        int x = 0;
        int y = 0;
        unordered_map<int, unordered_set<int>> visit;
        visit[0].insert(0);
        
        for(auto& direction : path){
            if(direction == 'N'){
                --y;
            } else if(direction == 'S'){
                ++y;
            } else if(direction == 'E'){
                ++x;
            } else if(direction == 'W'){
                --x;
            }
            if(visit[x].find(y) != visit[x].end()) return true;
            visit[x].insert(y);
        }
        
        return false;
    }
};