class Solution {
    fun average(salary: IntArray): Double {
        var maxSalary = salary[0]
        var minSalary = salary[0]
        var sum = 0
        salary.forEach{
            maxSalary = maxOf(it, maxSalary)
            minSalary = minOf(it, minSalary)
            sum += it
        }
        
         return (sum.toDouble() - maxSalary - minSalary) / (salary.size - 2)
    }
}