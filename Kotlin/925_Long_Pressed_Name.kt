class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {
        var i = 0
        for(ch in typed){
            if(i < name.length && ch == name[i]) {
                ++i
            } else if(i == 0 || ch != name[i - 1]){
                return false
            }
        }
        
        return name.length == i
    }
}