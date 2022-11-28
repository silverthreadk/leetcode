class SeatManager(n: Int) {
	private val pq = PriorityQueue<Int>()

    init {
        for(i in 1..n) {
            pq.add(i)
        }
    }

    fun reserve(): Int {
        val result = pq.poll()
        return result
    }

    fun unreserve(seatNumber: Int) {
        pq.add(seatNumber)
    }

}

/**
 * Your SeatManager object will be instantiated and called as such:
 * var obj = SeatManager(n)
 * var param_1 = obj.reserve()
 * obj.unreserve(seatNumber)
 */