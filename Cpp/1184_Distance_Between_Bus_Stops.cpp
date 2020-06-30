class Solution {
public:
    int distanceBetweenBusStops(vector<int>& distance, int start, int destination) {
        int n = distance.size();
        int clockwise_distance = 0;
        int counterclockwise_distance = 0;
        int start_bus_stop = min(start, destination);
        int destination_bus_stop = max(start, destination);
        for(int i=start_bus_stop; i<destination_bus_stop; ++i){
            clockwise_distance += distance[i];
        }
        
        for(int i=destination_bus_stop; i<start_bus_stop+n; ++i){
            counterclockwise_distance += distance[i%n];
        }
        
        return min(clockwise_distance, counterclockwise_distance);
    }
};