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
    int findTilt(TreeNode* root) {
        int result = 0;
        dfs(root, &result);
        return result;
    }
    
    int dfs(TreeNode* node, int* result){
        if(node == nullptr) return 0;
        
        int l = dfs(node->left, result);
        int r = dfs(node->right, result);
        *result += abs(l-r);
        return l + r + node->val;
    }
};