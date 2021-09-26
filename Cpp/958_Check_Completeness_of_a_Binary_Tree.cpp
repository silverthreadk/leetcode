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
    bool isCompleteTree(TreeNode* root) {
        int count = 0;

        return recursive(root, 1, &count) == count;
    }
    
    unsigned long long recursive(TreeNode* node, unsigned long long index, int* count) {
        if (!node) return 0;
        
        ++(*count);
        return max({index, recursive(node->left, 2 * index, count), recursive(node->right, 2 * index + 1, count)});
    }
};