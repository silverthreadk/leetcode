data class Node(
    val children: Array<Node?> = arrayOfNulls(26),
    var isWord: Boolean = false)

class Trie {
    val root = Node()
    
    fun add(word:String) {
        var current = root
        for(ch in word) {
            if(current.children[ch - 'a'] == null) current.children[ch - 'a'] = Node()
            current = current.children[ch - 'a']!!
        }
        current.isWord = true
    }

    fun search(word: String): Boolean{
        var node = root
        for(ch in word) {
            if(node.children[ch - 'a'] == null) return false
            node = node.children[ch - 'a']!!
        }
        if(word.isEmpty()) return true
        return node.isWord
    }
}

class Solution {
    fun longestWord(words: Array<String>): String {
        var result = ""
        val trie = Trie()
        words.sort()
        
        for(word in words){
            if(trie.search(word.substring(0, word.length-1))){
                if(result.length < word.length){
                    result = word
                }
                trie.add(word)
            }
            
        }
        
        return result
    }
}