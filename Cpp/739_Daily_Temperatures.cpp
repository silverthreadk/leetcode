class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& T) {
        int n = T.size();
        vector result(n, 0);
        std::stack<int> unclear;
        
        for(int i = 0; i < n - 1; ++i) {
            if (T[i+1]-T[i] > 0) {
                result[i] = 1;
            } else {
                unclear.push(i);
            }
            
            while(!unclear.empty() && T[unclear.top()] < T[i+1]){
                result[unclear.top()] = i + 1 - unclear.top();
                unclear.pop();
            }
        }
        
        return result;
    }
};