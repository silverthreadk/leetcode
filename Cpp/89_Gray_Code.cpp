class Solution {
public:
    vector<int> grayCode(int n) {
        int num = 1 << n;
        vector<int> result(num, 0);

        for(int i = 0; i < num; ++i) {
            result[i] = i ^ (i >> 1);
        }
        
        return result;
    }
};