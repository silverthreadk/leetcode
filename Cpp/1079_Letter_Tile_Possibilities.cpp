class Solution {
public:
    int numTilePossibilities(string tiles) {
        unordered_set<string> result;
        vector<bool> visit(tiles.size(), false);

        recursive(tiles, "", visit, result);

        return result.size();
    }

    void recursive(string tiles, string current, vector<bool>& visit, unordered_set<string>& result){
        for(int i = 0; i < tiles.size(); ++i){
            if(visit[i]) continue;

            current += tiles[i];
            result.insert(current);
            visit[i] = true;

            recursive(tiles, current, visit, result);

            visit[i] = false;
            current.pop_back();
        }
    }
};