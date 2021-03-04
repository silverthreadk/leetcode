class Solution {
    fun mincostToHireWorkers(quality: IntArray, wage: IntArray, K: Int): Double {
        val workers = mutableListOf<Worker>()
        for(i in 0 until quality.size){
            workers.add(Worker(quality[i], wage[i]))
        }
        
        workers.sortBy { it.ratio }
        
        val pq = PriorityQueue<Worker>(Comparator { a, b ->
            b.quality.compareTo(a.quality) })
        
        var total = 0
        var result = Double.MAX_VALUE
        
        for(worker in workers){
            pq.offer(worker)
            total += worker.quality

            if(pq.size > K){
                val w = pq.poll()
                total -= w.quality
            }

            if(pq.size == K){ 
                result = minOf(result, total * worker.ratio)
            }
        }

        return result
    }
    
    class Worker(val quality: Int, val wage: Int){
        val ratio = wage / quality.toDouble();
    }
}