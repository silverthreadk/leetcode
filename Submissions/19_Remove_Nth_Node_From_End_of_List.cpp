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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int depth = recursive(head, n);
        if(depth == n) return head->next;
        return head;
    }
    
    int recursive(ListNode* node, int n) {
        if(node == nullptr) return 0;
        int depth = recursive(node->next, n);
        if(n == depth) {
            node->next = node->next->next;
        }
        
        return depth + 1;
    }
};