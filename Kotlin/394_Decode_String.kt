class Solution {
    fun decodeString(s: String): String {
        val wordStack = Stack<StringBuilder>()
        val numStack = Stack<Int>()
        val result = StringBuilder()
        var word = StringBuilder()
        var num = 0
        
        for(ch in s){
            if(ch.isDigit()){
                num = num * 10 + (ch - '0')
                continue
            }else if(ch == '['){
                wordStack.push(word)
                numStack.push(num)
                num = 0
                word = StringBuilder()
            }else if(ch == ']'){
                val n = numStack.peek()
                
                var temp = StringBuilder()
                temp.append(word)
                
                for(i in 0 until n - 1){
                    word.append(temp)
                }
                
                word = wordStack.peek().append(word)
                wordStack.pop()
                numStack.pop()
            }else {
                word.append(ch)
            }
        }
        
        return word.toString()
    }
}