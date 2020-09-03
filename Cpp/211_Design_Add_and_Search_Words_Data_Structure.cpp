class WordDictionary {
public:
    struct TrieNode {
        bool is_leaf;
        vector<TrieNode*> children;

        TrieNode() : is_leaf(false), children(26, nullptr){
        }
    };
    
    /** Initialize your data structure here. */
    WordDictionary() : root(new TrieNode()){
        
    }
    
    /** Adds a word into the data structure. */
    void addWord(string word) {
        TrieNode* node = root;
        for(auto& ch : word){
            int index = ch -'a';
            if(node->children[index] == nullptr){
                node->children[index] = new TrieNode();
            }
            node = node->children[index];
        }
        node->is_leaf = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    bool search(string word) {
        return recursive(word, 0, root);
    }
    
    bool recursive(string word, int index, TrieNode* node){
        if(!node) return false;
        if(index == word.size()) return node->is_leaf;
        if(word[index] != '.') return recursive(word, index + 1, node->children[word[index]-'a']);
        for(int i=0; i<26; ++i){
            if (recursive(word, index + 1, node->children[i])) return true;
        }
        return false;
    }
    
private:
    TrieNode* root;
};

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary* obj = new WordDictionary();
 * obj->addWord(word);
 * bool param_2 = obj->search(word);
 */