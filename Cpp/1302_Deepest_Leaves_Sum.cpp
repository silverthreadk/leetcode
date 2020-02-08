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
    int deepestLeavesSum(TreeNode* root) {
        queue<TreeNode*> q;
        q.push(root);
        int sum;
        while(!q.empty()) {
            sum = 0;
            int n = q.size();
            for(int i=0; i<n; ++i){
                TreeNode* current = q.front();
                sum += current->val;
                if(current->left) q.push(current->left);
                if(current->right) q.push(current->right);
                q.pop();
            }
        }
        return sum;
    }
};