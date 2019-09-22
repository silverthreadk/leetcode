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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int> > result;
        if(!root) return result;
        
        queue<TreeNode*> q;
        q.push(root);
        bool is_forward_direction = true;
        while(!q.empty()){
            int n = q.size();
            vector<int> temp(n, 0);
            for(int i = 0; i<n; ++i){
                int index = is_forward_direction ? i : n-i-1;
                TreeNode* current = q.front();
                temp[index] = current->val;
                q.pop();
                if(current->left) q.push(current->left);
                if(current->right) q.push(current->right);
            }
            result.push_back(temp);
            is_forward_direction ^= true;
        }
        return result;
    }
};