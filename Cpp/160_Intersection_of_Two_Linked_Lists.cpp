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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int headA_length = getLength(headA);
        int headB_length = getLength(headB);
        
        ListNode* nodeA = headA;
        ListNode* nodeB = headB;
        int diff = headA_length - headB_length;
        if(headA_length < headB_length) {
            nodeA = headB;
            nodeB = headA;
            diff = headB_length - headA_length;
        }
        
        for(int i=0; i<diff; ++i){
          nodeA = nodeA->next;
        }
        
        while(nodeA != nodeB){
            if(!nodeA || !nodeB) return nullptr;
            nodeA = nodeA->next;
            nodeB = nodeB->next;
        }
        
        return nodeA;
    }
    
    int getLength(ListNode* head){
        ListNode* node = head;
        int length = 0;
        while(node){
            ++length;
            node = node->next;
        }
        
        return length;
    }
};