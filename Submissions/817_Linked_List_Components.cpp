/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int numComponents(ListNode* head, vector<int>& G) {
        int count = 0;
        unordered_set<int> s(G.begin(), G.end());
        ListNode* node = head;
        bool include = false;
        while(node){
            auto found = s.find(node->val);
            if(!include && found != s.end()) ++count;
            include = found != s.end();
            node = node->next;
        }
        return count;
    }
};