class Solution {
    fun getHint(secret: String, guess: String): String {
        var bulls = 0
        val count = IntArray(10){0}
        for(i in secret.indices) {
            if(guess[i] == secret[i]) {
                ++bulls
            } else {
                count[secret[i]-'0'] += 1
                count[guess[i]-'0'] -=1
            }
        }
        
        var wrong = 0
        count.forEach{
            wrong += maxOf(it, 0)
        }
        
        val stringBuilder = StringBuilder()
        stringBuilder.append(bulls.toString())
        stringBuilder.append("A")
        stringBuilder.append(secret.length - bulls - wrong)
        stringBuilder.append("B")
        
        return stringBuilder.toString()
    }
}