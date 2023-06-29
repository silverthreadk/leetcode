class Solution {
    fun maximumPopulation(logs: Array<IntArray>): Int {
        var result = 0
        val population = IntArray(2051)
        
        for(log in logs) {
            ++population[log[0]]
            --population[log[1]]
        }
        
        var maxPopulation = 0
        var current = 0
        for(i in 1950..2050) {
            current += population[i]

            if(current > maxPopulation){
                maxPopulation = current
                result = i
            }
        }
        
        return result
    }
}