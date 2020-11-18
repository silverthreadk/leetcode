class Solution {
public:
    vector<int> decrypt(vector<int>& code, int k) {
        int n = code.size();
        vector<int> result(n);
        if(k==0) return result;
        
        int key = k;
        int offset = n-1;
        if(k<0){
            key = -k;
            offset = key;
        }
        
        int sum = 0;
        for(int i=0; i<key; ++i){
            sum += code[i];
        }
        result[offset] = sum;
        
        for(int i=0; i<n-1; ++i){
            sum -= code[i];
            sum += code[(i+key)%n];
            result[(offset+1+i)%n] = sum;
        }
        
        return result;
    }
};