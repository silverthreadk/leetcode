class Solution {
public:
    int maximumSum(vector<int>& arr) {
        int deleted = 0;
        int not_deleted = arr[0];
        int result = arr[0];
        
        for(int i=1; i<arr.size(); ++i) {
            deleted = max(not_deleted, deleted + arr[i]);
            not_deleted = max(not_deleted + arr[i], arr[i]);
            result = max({result, deleted, not_deleted});
        }
        
        return result;
    }
};