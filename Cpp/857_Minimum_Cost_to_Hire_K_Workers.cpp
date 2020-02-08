class Solution {
public:
    double mincostToHireWorkers(vector<int>& quality, vector<int>& wage, int K) {
        vector<pair<double, int> > ratio;
        int n = quality.size();
        for(int i=0; i<n; ++i){
            ratio.push_back(make_pair(static_cast<double>(wage[i])/quality[i], i));
        }
        sort(ratio.begin(), ratio.end(), [](auto r1, auto r2){
            return r1.first < r2.first;
        });
        
        int sum = 0;
        priority_queue<int> q;
        for(int i=0; i<K; ++i){
            q.push(quality[ratio[i].second]);
            sum += quality[ratio[i].second];
        }
        
        double result = ratio[K-1].first * sum;
        for(int i=K; i<n; ++i){
            q.push(quality[ratio[i].second]);
            sum += quality[ratio[i].second];
            sum -= q.top();
            q.pop();
            result = min(result, ratio[i].first * sum);
        }
        
        return result;
    }
};