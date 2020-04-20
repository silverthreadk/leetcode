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
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        TreeNode* root = nullptr;
        stack<TreeNode*> parents;
        
        for(auto& num : preorder){
            TreeNode* node = new TreeNode(num);
            if(!root) root = node;
            
            if(parents.empty()){
                parents.push(node);
            } else {
                if(parents.top()->val > node->val) {
                    parents.top()->left = node;
                    parents.push(node);
                } else {
                    TreeNode* parent = nullptr;
                    while(!parents.empty() && parents.top()->val < node->val) {
                        parent = parents.top();
                        parents.pop();
                    }
                    
                    parent->right = node;
                    parents.push(node);
                }
            }
        }
        
        return root;
    }
};