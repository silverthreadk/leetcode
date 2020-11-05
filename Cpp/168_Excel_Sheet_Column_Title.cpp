class Solution {
public:
    string convertToTitle(int n) {
        string result = "";
        int current = n;
        while(current){
            --current;
            result += current%26 + 'A';
            current /= 26;
        }
        
        reverse(result.begin(), result.end());
        
        return result;
    }
};