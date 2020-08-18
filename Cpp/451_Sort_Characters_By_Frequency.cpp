class Solution {
public:
    string frequencySort(string s) {
        string result = "";
        unordered_map<char, int> frequency;
        for(auto& ch : s){
            ++frequency[ch];
        }
        
        priority_queue<pair<int, char>> pq;
        
        for(auto& it : frequency){
            pq.push({it.second, it.first});
        }
        
        while(!pq.empty()){
            auto current = pq.top();
            for(int i = current.first; i>0; --i){
                result += current.second;
            }
            pq.pop();
        }
        
        return result;
    }
};