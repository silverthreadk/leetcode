class Solution {
public:
    bool isLongPressedName(string name, string typed) {
        int j = 0;
        for(int i=0; i<typed.size(); ++i){
            if(typed[i] == name[j]) {
                ++j;
            } else if(j == 0 || typed[i] != name[j-1]){
                return false;
            }
        }
        
        return name.size() == j;
    }
};