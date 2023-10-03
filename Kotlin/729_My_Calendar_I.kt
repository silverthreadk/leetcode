class MyCalendar() {
    private val events = TreeMap<Int, Int>()

    fun book(start: Int, end: Int): Boolean {
        val event = events.lowerEntry(end)

        if(event == null || event.value <= start) {
            events[start] = end
            return true
        }

        return false
    }

}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * var obj = MyCalendar()
 * var param_1 = obj.book(start,end)
 */