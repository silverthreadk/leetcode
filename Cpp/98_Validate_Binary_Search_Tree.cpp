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
    bool isValidBST(TreeNode* root) {
        return recursive(root, LONG_MIN, LONG_MAX);
    }
    
    bool recursive(TreeNode* root, long min_val, long max_val){
        if(!root) return true;
        if(root->val >= max_val) return false;
        if(root->val <= min_val) return false;
        return recursive(root->left, min_val, root->val) && recursive(root->right, root->val, max_val);
    }
};