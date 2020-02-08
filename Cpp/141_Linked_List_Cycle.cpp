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
    bool hasCycle(ListNode *head) {
        set<ListNode *> visited;
        
        ListNode* curr = head;
        while(curr){
            auto found = visited.find(curr);
            if(found != visited.end()) return true;
            
            visited.insert(curr);
            curr = curr->next;
        }
        return false;
    }
};