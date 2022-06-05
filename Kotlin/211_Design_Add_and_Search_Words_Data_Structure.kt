data class TrieNode(
    val children: Array<TrieNode?> = arrayOfNulls(26),
    var isWord: Boolean = false)

class WordDictionary() {
    val root = TrieNode()

    fun addWord(word: String) {
        var current = root

        for(ch in word) {
            if(current.children[ch - 'a'] == null) current.children[ch - 'a'] = TrieNode()
            current = current.children[ch - 'a']!!
        }

        current.isWord = true
    }

    fun search(word: String): Boolean {
        return recursive(word, 0, root)
    }
    
    fun recursive(word: String, index: Int, node: TrieNode?): Boolean {
        if(node == null) return false
        if(index == word.length) return node.isWord
        if(word[index] != '.') return recursive(word, index + 1, node?.children[word[index] - 'a'])
        
        for(i in 0 until 26){
            if(recursive(word, index + 1, node?.children[i])) return true
        }
        
        return false
    }

}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * var obj = WordDictionary()
 * obj.addWord(word)
 * var param_2 = obj.search(word)
 */