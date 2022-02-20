class TrieNode {
    val children = Array<TrieNode?>(26) { null }
    var isLeaf = false
}

class Trie() {
    val root = TrieNode()

    fun insert(word: String) {
        var node = root

        for (w in word) {
            val i = w - 'a'
            if (node.children[i] == null) node.children[i] = TrieNode()
            node = node.children[i]!!
        }
        node.isLeaf = true
    }

    fun search(word: String): Boolean {
        var node = root
    
        for (ch in word) {
            val i = ch - 'a'
            if (node.children[i] == null) return false
            node = node.children[i]!!
        }
        return node.isLeaf
    }

    fun startsWith(prefix: String): Boolean {
        var node = root
    
        for (ch in prefix) {
            val i = ch - 'a'
            if(node.children[i] == null) return false
            node = node.children[i]!!
        }

        return true
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * var obj = Trie()
 * obj.insert(word)
 * var param_2 = obj.search(word)
 * var param_3 = obj.startsWith(prefix)
 */