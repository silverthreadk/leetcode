class Solution {
    fun minOperations(logs: Array<String>): Int {
        var result = 0
        for(log in logs){
            if(log.equals("../")) {
                result = maxOf(0, result - 1)
            } else if(!log.equals("./")){
                ++result
            }
        }
        
        return result
    }
}