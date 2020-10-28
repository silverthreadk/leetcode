class Solution {
public:
    bool isRobotBounded(string instructions) {
        int direction = 0;
        int x = 0;
        int y = 0;
        for(int i=0; i<4; ++i){
            for(auto& ch : instructions){
                if(ch == 'G') {
                    if(direction == 0) {
                        ++y;
                    }else if(direction == 1){
                        ++x;
                    }else if(direction == 2){
                        --y;
                    }else if(direction == 3){
                        --x;
                    }
                }else if(ch == 'L'){
                    direction = (direction - 1 + 4) % 4;
                }else if(ch == 'R'){
                    direction = (direction + 1) % 4;
                }
            }
        }
        return x == 0 && y == 0;
    }
};