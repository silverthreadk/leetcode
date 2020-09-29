class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        vector<int> result(arr.size());
        int greatest_element = arr.back();
        
        result[arr.size()-1] = -1;
        for(int i=arr.size()-2; i>=0; --i){
            result[i] = greatest_element;
            if(greatest_element < arr[i]){
                greatest_element = arr[i];
            }
        }
        
        return result;
    }
};