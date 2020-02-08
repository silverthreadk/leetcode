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
    ListNode* rotateRight(ListNode* head, int k) {
        if(!head) return nullptr;
        
        int i = 0;
        ListNode* node = head;
        while(node->next){
            ++i;
            node = node->next;
        }
        node->next = head;
        
        node = head;
        int n = i-k%(i+1);
        for(i=0; i<n; ++i){
            node = node->next;
        }
        ListNode* result = node->next;
        node->next = nullptr;
        
        return result;
    }
};