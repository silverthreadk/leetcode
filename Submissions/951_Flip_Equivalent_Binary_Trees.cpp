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
    bool flipEquiv(TreeNode* root1, TreeNode* root2) {
        if(root1 == NULL && root2 == NULL) return true;
        if(root1 == NULL || root2 == NULL) return false;
        
        int root1_left = (root1->left) ? root1->left->val : -1;
        int root1_right = (root1->right) ? root1->right->val : -1;
        int root2_left = (root2->left) ? root2->left->val : -1;
        int root2_right = (root2->right) ? root2->right->val : -1;

        if ((root1_left == root2_left && root1_right == root2_right)) {
            return flipEquiv(root1->left, root2->left) && flipEquiv(root1->right, root2->right);
        } else if (root1_left == root2_right && root1_right == root2_left) {
            return flipEquiv(root1->left, root2->right) && flipEquiv(root1->right, root2->left);
        } else {
            return false;
        }
    }
};