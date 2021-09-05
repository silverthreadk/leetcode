class Solution {
public:
    int maxProfitAssignment(vector<int>& difficulty, vector<int>& profit, vector<int>& worker) {
        int result = 0;
        priority_queue<pair<int,int>> pq;
        for(int i=0; i<profit.size(); ++i) {
            pq.push({profit[i], difficulty[i]});
        }
        
        sort(worker.begin(), worker.end(), greater<int>());
        
        for(int i=0; i<worker.size(); ++i) {
            while(!pq.empty() && pq.top().second > worker[i]) {
                pq.pop();
            }
            if(!pq.empty()) {
                result+= pq.top().first;
            }
        }
        
        return result;
    }
};