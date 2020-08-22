class Trie {
public:
    Trie() : root(new TrieNode()){ 
    }
    
    void insert(const string& word) {
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
    
    bool search(const string& word) {
        TrieNode* node = root;
        for(auto& ch : word){
            int index = ch-'a';
            if(node->children[index] == nullptr) return false;
            node = node->children[index];
        }
        if(word.empty()) return true;
        return node->is_leaf;
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

class Solution {
public:
    string longestWord(vector<string>& words) {
        string result = "";
        Trie trie;
        sort(words.begin(), words.end());

        for(auto& word : words){
            if(trie.search(word.substr(0, word.size()-1))){
                if(result.size() < word.size()){
                    result = word;
                }
                trie.insert(word);
            }
            
        }
        return result;
    }
};