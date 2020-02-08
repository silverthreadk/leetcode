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
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        if(l1 == nullptr) return l2;
        if(l2 == nullptr) return l1;
        
        ListNode* result = l1;
        ListNode* remain = l2;
        if(result->val > remain->val) std::swap(result, remain);
        
        ListNode* current = result;
        while(current->next != nullptr) {
            if(current->next->val > remain->val){
                std::swap(current->next, remain);
            } else {
                current = current->next;
            }
        }
        current->next = remain;
        
        return result;
    }
};