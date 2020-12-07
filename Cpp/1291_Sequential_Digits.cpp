class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        vector<int> result;
        
        for(int i=1; i<10; ++i){
            int num = i;
            int next = i;
            while(num <= high && next < 10){
                if(num >= low){
                    result.push_back(num);
                }
                
                ++next;
                num = 10 * num + next;
            }
        }
        sort(result.begin(), result.end());
        
        return result;
    }
};