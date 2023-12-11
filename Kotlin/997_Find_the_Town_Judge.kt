class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val count = IntArray(n + 1)

        for(t in trust){
            --count[t[0]]
            ++count[t[1]]
        }

        for(i in 1..n){
            if(count[i] == n - 1) return i
        }

        return -1
    }
}