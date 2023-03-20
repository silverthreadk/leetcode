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
    int findBottomLeftValue(TreeNode* root) {
        int result = -1;
        int max_depth = -1;

        recursive(root, 0, &max_depth, &result);

        return result;
    }

    void recursive(TreeNode* root, int depth, int* max_depth, int* result){
        if(root == nullptr)return;
        
        if(depth > *max_depth){
            *max_depth = depth;
            *result = root->val;
        }

        recursive(root->left, depth + 1, max_depth, result);
        recursive(root->right, depth + 1, max_depth, result);
    }
};