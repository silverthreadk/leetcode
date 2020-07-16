class Solution {
public:
    double average(vector<int>& salary) {
        int max_salary = salary[0];
        int min_salary = salary[0];
        int sum = 0;
        for(auto& it : salary){
            max_salary = max(it, max_salary);
            min_salary = min(it, min_salary);
            sum += it;
        }
        
         return static_cast<double>(sum - max_salary - min_salary) / (salary.size()-2);
    }
};