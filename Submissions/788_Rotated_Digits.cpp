class Solution {
public:
    int rotatedDigits(int N) {
        int result = 0;
        for(int i=1; i<=N; ++i){
            int curr = i;
            bool is_good_number = false;
            while(curr != 0){
                int remainder = curr % 10;
                if(remainder == 3 || remainder == 4 || remainder == 7) {
                    is_good_number = false; 
                    break;
                }   
                if(remainder == 2 || remainder == 5 || remainder == 6 || remainder == 9) is_good_number = true;
                curr = curr/10;
            }
            if(is_good_number) ++result;
        }
        return result;
    }
};