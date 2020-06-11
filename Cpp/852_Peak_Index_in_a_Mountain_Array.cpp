class Solution {
public:
    int peakIndexInMountainArray(vector<int>& A) {
        int low = 0;
        int high = A.size()-1;
        
        while(low<=high){
            int mid = (low + high) / 2;
            if(A[mid] > A[mid-1] && A[mid] > A[mid+1]) return mid;
            if(A[mid] < A[mid+1]) low = mid + 1;
            else high = mid - 1;
        }
        
        return 0;
    }
};