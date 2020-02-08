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
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        vector<vector<int> > result;
        if(root == nullptr) return result;
        
        queue<TreeNode*> q;
        TreeNode* node = root;
        q.push(node);
        while(!q.empty()){
            int n = q.size();
            vector<int> level;
            for(int i = 0; i < n; ++i){
                node = q.front();
                level.push_back(node->val);
                if(node->left != nullptr) q.push(node->left);
                if(node->right != nullptr) q.push(node->right);
                q.pop();
            }
            result.push_back(level);
        }
        
        std::reverse(result.begin(), result.end());
        
        return result;
    }
};