class Solution {
public:
    char slowestKey(vector<int>& releaseTimes, string keysPressed) {
        char result = keysPressed[0];
        int max_time = releaseTimes[0];
        for(int i=1; i<releaseTimes.size(); ++i){
            int time = releaseTimes[i]-releaseTimes[i-1];
            if(time < max_time) continue;
            else if(time == max_time && keysPressed[i] < result) continue;
            
            max_time = time;
            result = keysPressed[i];
        }
        
        return result;
    }
};