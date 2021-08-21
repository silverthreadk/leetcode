class Solution {
public:
    int secondHighest(string s) {
        int result = -1;
        int largest_num = -1;
        
        for(auto& ch : s) {
            if (ch < '0' || ch > '9') continue;
            if (largest_num < ch - '0') {
                result = largest_num;
                largest_num = ch - '0';
            } else if(largest_num > ch - '0' && result < ch - '0') {
                result = ch - '0';
            }
        }
        
        return result;
    }
};