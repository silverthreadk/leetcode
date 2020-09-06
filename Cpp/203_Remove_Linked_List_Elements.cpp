/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        if(!head) return head;
        
        while(head && head -> val == val) {
            head = head -> next;
        }
        
        ListNode* node = head;
        while(node && node->next){
            if(node->next->val == val){
                ListNode* temp = node->next->next;
                node->next = temp;
            } else {
                node = node->next;
            }
        }
        
        return head;
    }
};