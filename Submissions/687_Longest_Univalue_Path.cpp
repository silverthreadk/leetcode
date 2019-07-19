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
    int longestUnivaluePath(TreeNode* root) {
        int result = 0;
        
        recursive(root, &result);
        
        return result;
    }
    
    int recursive(TreeNode* node, int* result) {
        if(node == nullptr) return 0;
        
        int left_length = recursive(node->left, result);
        int right_length = recursive(node->right, result);
        if(node->left && node->val == node->left->val){
            ++left_length;
        } else {
            left_length = 0;
        }
        
        if(node->right && node->val == node->right->val){
            ++right_length;
        } else {
            right_length = 0;
        }
        
        *result = std::max(*result, left_length + right_length);
        
        return std::max(left_length, right_length);
    }
};
