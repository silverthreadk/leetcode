class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> result;
        bool flag;
        for(int i = left; i <= right; ++i){
            int n = i;
            flag = true;
            while (n != 0) {
                int remainder = n % 10;
                if (remainder == 0 || i % remainder != 0) {
                    flag = false;
                    break; 
               }
                n = n / 10;
            }
            if(flag){
                result.push_back(i);
            }
        }
        return result;
    }
};