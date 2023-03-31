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
    int distributeCoins(TreeNode* root) {
        int result = 0;

        recursive(root, &result);

        return result;
    }

    int recursive(TreeNode* root, int* result) {
        if(!root) return 0;

        int left = recursive(root -> left, result);
        int right = recursive(root -> right, result);

        *result += abs(left) + abs(right);
        
        return root -> val - 1 + left + right;
    }
};