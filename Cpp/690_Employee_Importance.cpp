/*
// Definition for Employee.
class Employee {
public:
    int id;
    int importance;
    vector<int> subordinates;
};
*/

class Solution {
public:
    int getImportance(vector<Employee*> employees, int id) {
        int result = 0;
        for(auto& employee : employees){
            if(employee->id!=id) continue;
            result += employee->importance;
            for(auto& subordinate : employee->subordinates){
                result += getImportance(employees, subordinate);
            }
            return result;
        }
        
        return result;
    }
};