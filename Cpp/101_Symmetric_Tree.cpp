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
    bool isSymmetric(TreeNode* root) {
        queue<TreeNode*> q;
        q.push(root);
        q.push(root);
        
        while(!q.empty()){
            TreeNode* left = q.front();
            q.pop();
            TreeNode* right = q.front();
            q.pop();
            
            if(left->val != right->val) return false;
            if(left->left && right->right){
                q.push(left->left);
                q.push(right->right);
            } else if(left->left || right->right) {
                return false;
            }
            
            if(left->right && right->left){
                q.push(left->right);
                q.push(right->left);
            } else if(left->right || right->left) {
                return false;
            }
        }
        
        return true;
    }
};