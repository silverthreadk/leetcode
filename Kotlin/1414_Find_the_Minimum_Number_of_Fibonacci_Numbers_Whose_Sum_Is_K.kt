class Solution {
    fun findMinFibonacciNumbers(k: Int): Int {
        var result = 0
        val fi = mutableListOf<Int>()
        
        fi.add(1)
        fi.add(1)
        
        for(i in 2 .. k){
            if(fi[i - 1] >= k) break
            fi.add(fi[i - 1] + fi[i - 2])
        }
        
        var n = k
        for(i in fi.size - 1 downTo 1){
            if(n - fi[i] < 0) continue
            
            n -= fi[i]
            ++result
        }
        
        return result
    }
}