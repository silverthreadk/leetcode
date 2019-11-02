class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int> result;
        unordered_map<int, int> frequencys;
        for(auto& num : nums){
            ++frequencys[num];
        }
        
        priority_queue<pair<int,int>,vector<pair<int, int> >, less<pair<int, int> > > pq;
        for(auto& frequency : frequencys){
            pq.push({frequency.second, frequency.first});
        }
        
        for(int i=0; i<k; ++i){
            auto element = pq.top();
            result.push_back(element.second);
            pq.pop();
        }
        
        return result;
    }
};