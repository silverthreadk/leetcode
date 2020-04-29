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
    int maxPathSum(TreeNode* root) {
        int sum = root->val;
        recursive(root, &sum);
        
        return sum;
    }
    
    int recursive(TreeNode* node, int* sum){
        if(node == nullptr) return 0;

        int left = recursive(node->left, sum);
        int right = recursive(node->right, sum);
        *sum = max(*sum, node->val + left + right);
        
        return max(0, node->val + max(left, right));
    }
};