class Solution {
public:
    bool canReach(vector<int>& arr, int start) {
        int n = arr.size();
        vector<bool> visit(n, false);
        return recursive(arr, start, visit);
    }
    
    bool recursive(vector<int>& arr, int index, vector<bool>& visit){
        if(index < 0) return false;
        if(index >= arr.size()) return false;
        if(visit[index]) return false;
        if(arr[index] == 0) return true;
        
        visit[index] = true;
        return recursive(arr, index + arr[index], visit) || recursive(arr, index - arr[index], visit);
    }
            
};