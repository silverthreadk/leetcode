class Trie {
public:
    /** Initialize your data structure here. */
    Trie() : root(new TrieNode()){
        
    }
    
    /** Inserts a word into the trie. */
    void insert(string word) {
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
    
    /** Returns if the word is in the trie. */
    bool search(string word) {
        TrieNode* node = root;
        for(auto& ch : word){
            int index = ch-'a';
            if(node->children[index] == nullptr) return false;
            node = node->children[index];
        }
        return node->is_leaf;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    bool startsWith(string prefix) {
        TrieNode* node = root;
        for(auto& ch : prefix){
            int index = ch-'a';
            if(node->children[index] == nullptr) return false;
            node = node->children[index];
        }
        return true;
    }

private:
    struct TrieNode {
        bool is_leaf;
        vector<TrieNode*> children;

        TrieNode() : is_leaf(false), children(26, nullptr){
        }
    };
    
    TrieNode* root;
    
};

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */