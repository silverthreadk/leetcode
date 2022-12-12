class Solution {
public:
    int countPoints(string rings) {
        int result = 0;
        vector<unordered_set<char>> count(10);

        for(int i = 0; i < rings.size(); i += 2) {
            count[rings[i + 1] - '0'].insert(rings[i]);
        }

        for(auto& s : count) {
            if(s.size() == 3) ++result;
        }

        return result;
    }
};