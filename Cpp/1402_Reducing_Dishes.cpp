class Solution {
public:
    int maxSatisfaction(vector<int>& satisfaction) {
        int result = 0;
        int sum = 0;
        int current = 0;
        
        sort(satisfaction.begin(), satisfaction.end());

        for (int i = satisfaction.size() - 1; i >= 0; --i) {
            sum += satisfaction[i];
            current += sum;
            result = max(result, current);
        }

        return result;
    }
};