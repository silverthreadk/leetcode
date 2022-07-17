/*
 *	// Definition for Employee.
 *	class Employee {
 *		var id:Int = 0
 *		var importance:Int = 0
 *		var subordinates:List<Int> = listOf()
 *	}
 */

class Solution {
    fun getImportance(employees: List<Employee?>, id: Int): Int {
        var result = 0
        
        employees.forEach{ employee ->
            if(employee?.id == id){
                result += employee.importance
                if (employee.subordinates.isEmpty()) return result
                
                employee.subordinates.forEach{ subordinate ->
                    result += getImportance(employees, subordinate)
                }
                
                return result
            }
        }
        
        return result
    }
}