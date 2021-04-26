class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val pq = PriorityQueue<IntArray>(Comparator {a, b ->
                distance(b).compareTo(distance(a)) })
        
        for(point in points) {
            pq.offer(point)

            if(pq.size > k) pq.poll()
        }

        return pq.toTypedArray()
    }
    
    fun distance(point: IntArray) = point[0] * point[0] + point[1] * point[1]
}