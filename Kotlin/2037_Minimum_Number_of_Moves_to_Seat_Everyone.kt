class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        var result = 0

        seats.sort()
        students.sort()

        for(i in students.indices) {
            result += Math.abs(students[i] - seats[i])
        }

        return result
    }
}