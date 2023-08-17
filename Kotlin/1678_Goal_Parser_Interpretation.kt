class Solution {
    fun interpret(command: String): String {
        var result = StringBuilder()
        
        for(i in command.indices) {
            if(command[i] == 'G') {
                result.append('G')
            }else if(command[i] == ')') {
                if(command[i - 1] == '(') result.append('o')
                else result.append("al")
            }
        }
        
        return result.toString()
    }
}