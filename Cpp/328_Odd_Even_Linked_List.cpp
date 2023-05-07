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
    ListNode* oddEvenList(ListNode* head) {
        if(!head || !head->next) return head;

        ListNode* odd_node = head;
        ListNode* even_head = head->next;
        ListNode* even_node = head->next;

        while(even_node && even_node->next){
            odd_node->next = even_node->next;
            odd_node = odd_node->next;

            even_node->next = odd_node->next;
            even_node = even_node->next;
        }

        odd_node->next = even_head;
        
        return head;
    }
};