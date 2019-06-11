/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
public:
    vector<int> postorder(Node* root) {
        vector<int> result;
        
        if(root == NULL) return result;
        
        std::stack<std::pair<Node*, int> > parents;
        parents.push(std::make_pair(root, 0));
       
        while(!parents.empty()){
            Node* current = parents.top().first;
            int nth = parents.top().second;
            
            if (nth == current->children.size()) {
                result.push_back(parents.top().first->val);
                parents.pop();
            } else {
                parents.top().second++;
                parents.push(std::make_pair(parents.top().first->children[nth], 0));
            }
        }

        return result;
    }
};