class Solution {
public:
    int thirdMax(vector<int>& nums) {
        int result = 0;
        priority_queue<int, vector<int>, greater<int>> pq;
        set<int> s(nums.begin(), nums.end());
        
        for(auto& num : s){
            if(pq.size() < 3){
                pq.push(num);
            } else if(pq.top() < num){
                pq.pop();
                pq.push(num);
            }
        }
        
        if(pq.size() >= 3){
            return pq.top();
        }
        
        while(!pq.empty()){
            result = pq.top();
            pq.pop();
        }
        
        return result;
    }
};