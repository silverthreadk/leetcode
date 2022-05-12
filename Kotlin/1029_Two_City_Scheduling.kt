class Solution {
    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        var result = 0
        
        costs.sortWith(Comparator{a, b -> 
            (a[0] - a[1]).compareTo(b[0] - b[1])
        })
        
        for(i in 0..costs.size / 2 - 1) {
            result += costs[i][0]
            result += costs[i + costs.size / 2][1]
        }

        return result
    }
}