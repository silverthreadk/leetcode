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
    int sumRootToLeaf(TreeNode* root) {
        return recursive(root, 0);
    }
    
    int recursive(TreeNode* node, int sum){
        if(node == nullptr) return 0;
        if(!node->left && !node->right) return sum * 2 + node->val; 
        return recursive(node->left, sum*2 + node->val) + recursive(node->right, sum*2 + node->val);
    }
};