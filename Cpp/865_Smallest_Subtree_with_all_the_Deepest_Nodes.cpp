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
    TreeNode* subtreeWithAllDeepest(TreeNode* root) {
        auto result = recursive(root);
        return result.second;
    }
    
    pair<int, TreeNode*> recursive(TreeNode* node){
        if(!node) return std::make_pair(0, nullptr);
        
        auto left_result = recursive(node->left);
        auto right_result = recursive(node->right);
        
        if (left_result.first == right_result.first) return std::make_pair(left_result.first+1, node);
        else if (left_result.first > right_result.first) return std::make_pair(left_result.first+1, left_result.second);
        else return std::make_pair(right_result.first+1, right_result.second);        
    }
};