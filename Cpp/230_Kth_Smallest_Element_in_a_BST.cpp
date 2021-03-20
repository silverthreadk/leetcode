/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int kthSmallest(TreeNode* root, int k) {
        vector<int> tree;
        recursive(root, &tree);
        return tree[k-1];
    }
    
    void recursive(TreeNode* node, vector<int>* tree){
        if(node == nullptr) return;
        
        recursive(node->left, tree);
        tree->push_back(node->val);
        recursive(node->right, tree);
    }
};