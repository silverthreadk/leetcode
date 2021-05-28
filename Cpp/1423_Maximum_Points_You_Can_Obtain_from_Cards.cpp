class Solution {
public:
    int maxScore(vector<int>& cardPoints, int k) {
        int n = cardPoints.size();
        if(n <= k) return accumulate(cardPoints.begin(), cardPoints.end(), 0);
        
        int sum = 0;
        for(int i = 0; i<k; ++i) {
            sum += cardPoints[i];
        }
        
        int result = sum;
        for(int i=0; i<k; ++i) {
            sum -= cardPoints[k-i-1];
            sum += cardPoints[n-i-1];
            result = max(result, sum);
        }
        
        return result;
    }
};