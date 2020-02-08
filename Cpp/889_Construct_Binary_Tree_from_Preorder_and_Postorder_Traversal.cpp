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
    TreeNode* constructFromPrePost(vector<int>& pre, vector<int>& post) {
        stack<TreeNode*> parent;
        
        TreeNode * root = new TreeNode(pre[0]);
        TreeNode * current = root;
        
        parent.push(current);
        
        int post_index = 0;
        for (int pre_index = 1; pre_index < pre.size();) {
            auto found = find(pre.begin(), pre.begin()+pre_index, post[post_index]);
            if (found != pre.begin()+pre_index){
                current = parent.top();
                parent.pop();
                ++post_index;
            } else {
                parent.push(current);
                TreeNode * child = new TreeNode(pre[pre_index]);
                
                if (!current->left) {
                    current->left = child;
                } else if(!current->right) {
                    current->right = child;
                } 
                current = child;
                ++pre_index;
            }
        }
        return root;
    }
};