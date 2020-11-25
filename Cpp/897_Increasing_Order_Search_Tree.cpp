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
    TreeNode* increasingBST(TreeNode* root) {
        return recursive(root, nullptr);
    }
    
    TreeNode* recursive(TreeNode* node, TreeNode* prev){
        if (!node) return prev;
        TreeNode *left = recursive(node->left, node);
        node->left = nullptr;
        node->right = recursive(node->right, prev);
        return left;
    }
};