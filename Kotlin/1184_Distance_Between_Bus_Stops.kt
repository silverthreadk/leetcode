class Solution {
    fun distanceBetweenBusStops(distance: IntArray, start: Int, destination: Int): Int {
        val n = distance.size
        val startBusStop = minOf(start, destination)
        val destinationBusStop = maxOf(start, destination)
        var clockwiseDistance = 0
        var counterclockwiseDistance = 0
        
        for(i in startBusStop until destinationBusStop){
            clockwiseDistance += distance[i]
        }
        
        for(i in destinationBusStop until startBusStop + n){
            counterclockwiseDistance += distance[i%n]
        }
        
        return minOf(clockwiseDistance, counterclockwiseDistance)
    }
}