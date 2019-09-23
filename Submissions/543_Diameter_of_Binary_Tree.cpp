/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int diameterOfBinaryTree(TreeNode* root) {
        int result = 0;
        getDepth(root, result);
        return result;
    }
    
    int getDepth(TreeNode* node, int& result){
        if(node == nullptr) return 0;
        int left = getDepth(node->left, result);
        int right = getDepth(node->right, result);
        result = max(result, left+right);
        
        return max(left, right) + 1;
    }
};