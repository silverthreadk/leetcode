class Solution {
public:
    int flipgame(vector<int>& fronts, vector<int>& backs) {
        int minimum = 2001;
        set<int> s;
        for(int i=0; i<fronts.size(); ++i){
            if(fronts[i] == backs[i]) s.insert(fronts[i]);
        }
        for(int i=0; i<fronts.size(); ++i){
            if(s.find(fronts[i])==s.end()) minimum = min(minimum, fronts[i]);
            if(s.find(backs[i])==s.end()) minimum = min(minimum, backs[i]);
        }
        return (minimum==2001) ? 0 : minimum;
    }
};