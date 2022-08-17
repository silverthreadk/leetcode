class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val s = Stack<Int>()
        
        for(asteroid in asteroids){
            var collision = false
            while(s.isNotEmpty() && asteroid < 0 && 0 < s.peek()){
                if(s.peek() < -asteroid){
                    s.pop()
                    continue
                } else if (s.peek() == -asteroid){
                    s.pop()
                }
                collision = true
                break
            }
            if(!collision){
                s.push(asteroid)
            }
        }
        
        return s.toIntArray()
    }
}