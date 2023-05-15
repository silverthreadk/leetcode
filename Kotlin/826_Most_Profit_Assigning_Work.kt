class Solution {
    fun maxProfitAssignment(difficulty: IntArray, profit: IntArray, worker: IntArray): Int {
        var result = 0;
        val pq = PriorityQueue(Comparator<Job>{ a, b ->
            if (a.profit == b.profit) a.difficulty - b.difficulty else b.profit - a.profit
        })
        
        for(i in profit.indices) {
            pq.offer(Job(difficulty[i], profit[i]))
        }
        
        worker.sortDescending()

        worker.forEach {
            while(!pq.isEmpty() && pq.peek().difficulty > it) {
                pq.poll()
            }
            if(!pq.isEmpty()) {
                result += pq.peek().profit
            }
        }
        
        return result
    }
}

data class Job(val difficulty: Int, val profit: Int)