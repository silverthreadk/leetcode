class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        vector<int> result;
        
        for(auto& asteroid : asteroids){
            bool collision = false;
            while(!result.empty() && asteroid < 0 && 0 < result.back()){
                if(result.back() < -asteroid){
                    result.pop_back();
                    continue;
                } else if (result.back() == -asteroid){
                    result.pop_back();
                }
                collision = true;
                break;
            }
            if(!collision){
                result.push_back(asteroid);
            }
        }
        
        return result;
    }
};