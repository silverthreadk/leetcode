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
    int widthOfBinaryTree(TreeNode* root) {
        queue<pair<TreeNode*, int> > q;
        q.push(make_pair(root, 1));
        int width = 1;
        while(!q.empty()){
            int n = q.size();
            if(n == 1) q.front().second = 1;
            width = max(width, q.back().second-q.front().second+1);
            for(int i=0; i<n; ++i){
                TreeNode* node = q.front().first;
                int index = q.front().second;
                q.pop();
                if(node->left) q.push(make_pair(node->left, index*2-1));
                if(node->right) q.push(make_pair(node->right, index*2));
            }
        }
        return width;
    }
};