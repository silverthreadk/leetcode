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
    int sumNumbers(TreeNode* root) {
        return recursive(root, 0);
    }
    
    int recursive(TreeNode* node, int num) {
        if(!node) return 0;
        if(!node->left && !node->right) {
            return num*10+node->val;
        }
        
        return recursive(node->left, num*10+node->val)
            + recursive(node->right, num*10+node->val);
    }
};