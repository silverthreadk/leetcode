// Forward declaration of guess API.
// @param num, your guess
// @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
int guess(int num);

class Solution {
public:
    int guessNumber(int n) {
        unsigned int high = n, low = 1, mid = 1;
        while(low<=high){
            mid = (high+low)/2;
            int result = guess(mid);
            if(result == 0) return mid;
            else if(result > 0) low = mid+1;
            else high = mid-1;
        }
        
        return mid;
    }
};