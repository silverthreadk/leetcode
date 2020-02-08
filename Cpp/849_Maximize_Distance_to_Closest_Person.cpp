class Solution {
public:
    int maxDistToClosest(vector<int>& seats) {
        int result = 0;
        int p1 = -1, p2 = -1;
        int n = seats.size();
        for(int i=0; i<n; ++i) {
            if(seats[i] == 0) continue;
            p1 = p2;
            p2 = i;
            if(p1 == -1 && seats[0] == 0) result = i;
            else if(p2 >= 0 && p1 >= 0) result = std::max(result, (p2-p1)/2);
        }
        if(seats[n-1] == 0) result = std::max(result, n-1-p2);
        
        return result;
    }
};