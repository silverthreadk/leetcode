1041. Robot Bounded In Circle
class Solution {
    fun isRobotBounded(instructions: String): Boolean {
        var direction = 0
        var x = 0
        var y = 0
        
        for(i in 0 until 4){
            for(ch in instructions){
                when(ch) {
                    'G' -> {
                        when(direction){
                            0 -> ++y
                            1 -> ++x
                            2 -> --y
                            3 -> --x
                        }
                    }
                    'L' -> {
                        direction = (direction - 1 + 4) % 4
                    }
                    'R' ->{
                        direction = (direction + 1) % 4
                    }
                }
            }
        }
        
        return x == 0 && y == 0
    }
}