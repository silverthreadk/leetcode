class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
        vector<vector<int>> result;
        sort(arr.begin(), arr.end());

        int min_diffrence = arr[1] - arr[0];
        for(int i=2; i<arr.size(); ++i){
            min_diffrence = min(min_diffrence, arr[i] - arr[i-1]);
        }
        
        for(int i=1; i<arr.size(); ++i){
            if(min_diffrence == arr[i] - arr[i-1]){
                result.push_back({arr[i-1], arr[i]});
            }
        }
        
        return result;
    }
};