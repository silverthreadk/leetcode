class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int H) {
        int lo = 1, hi = *max_element(piles.begin(), piles.end());
        
        while(lo < hi) {
            int mid = (hi + lo) / 2;
            if(check(piles, H, mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        
        return lo;
    }
    
    bool check(const vector<int>& piles, int H, int k) {
        int time = 0;
        for(auto& pile : piles){
            time += pile / k + (pile % k == 0 ? 0 : 1);
        }
        
        return time <= H;
    }
};