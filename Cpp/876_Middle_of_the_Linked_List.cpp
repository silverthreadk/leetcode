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
    ListNode* middleNode(ListNode* head) {
        int depth = 0;
        return getMiddleNode(head, 0, &depth);
    }
    
    ListNode* getMiddleNode(ListNode* node, int index, int* depth){
        if(!node->next) {
            *depth = index;
            return node;
        }
        
        ListNode* result = getMiddleNode(node->next, index+1, depth);
        if (index == (*depth + 1) / 2) return node;
        
        return result;
    }
};