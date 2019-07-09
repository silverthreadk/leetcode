/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class BSTIterator {
public:
    BSTIterator(TreeNode* root) {
        inorder(root);
    }
    
    void inorder(TreeNode* node) {
        if(node == nullptr) return;
        
        inorder(node->left);
        next_.push(node);
        inorder(node->right);
    }
    
    /** @return the next smallest number */
    int next() {
        if(!hasNext()) return 0;
        
        int value = next_.front()->val;
        next_.pop();
        
        return value;
    }
    
    /** @return whether we have a next smallest number */
    bool hasNext() {
        return !next_.empty();
    }
private:
    queue<TreeNode*> next_;
};

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator* obj = new BSTIterator(root);
 * int param_1 = obj->next();
 * bool param_2 = obj->hasNext();
 */