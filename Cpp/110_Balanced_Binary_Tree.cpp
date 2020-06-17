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
    bool isBalanced(TreeNode* root) {
        bool result = true;
        getDepth(root, &result);
        
        return result;
    }
    
    int getDepth(TreeNode* node, bool* result){
        if(!node || !*result) return 0;
        
        int left = getDepth(node->left, result);
        int right = getDepth(node->right, result);
        
        if(abs(left-right) > 1) *result = false;
        return max(left, right) + 1;
    } 
};