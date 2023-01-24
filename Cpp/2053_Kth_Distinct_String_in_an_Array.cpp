class Solution {
public:
    string kthDistinct(vector<string>& arr, int k) {
        unordered_map<string, int> frequency;

        for(auto& s : arr){
            ++frequency[s];
        }

        int index = 0;
        for(int i = 0; i < arr.size(); ++i){
            if(frequency[arr[i]] == 1) ++index;

            if(index == k) return arr[i];
        }

        return "";
    }
};