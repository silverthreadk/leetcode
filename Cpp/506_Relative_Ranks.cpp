class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        vector<string> result(score.size()); 
        priority_queue<pair<int,int>> pq;
        
        for(int i = 0; i < score.size(); ++i){
            pq.push({score[i], i});
        }
        
        for(int i = 0; !pq.empty(); ++i){
            if(i == 0) {
                result[pq.top().second] = "Gold Medal";
            } else if (i == 1) {
                result[pq.top().second] = "Silver Medal";
            } else if (i == 2) {
                result[pq.top().second] = "Bronze Medal";
            } else {
                result[pq.top().second] = to_string(i + 1);
            }
            
            pq.pop();
        }
        
        return result;
    }
};