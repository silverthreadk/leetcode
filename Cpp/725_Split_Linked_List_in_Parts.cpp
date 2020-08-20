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
    vector<ListNode*> splitListToParts(ListNode* root, int k) {
        vector<ListNode*> result(k);
        int n = 0;
        ListNode* node = root;
        while(node){
            ++n;
            node = node->next;
        }
        
        int length = n/k;
        int remainder = n%k;
        ListNode* last = nullptr;
        node = root;
        for(int i=0; i<k; ++i){
            result[i] = node;
            for(int j=0; j<length + (i<remainder ? 1 : 0); ++j){
                last = node;
                node = node->next;
            }
            if(!last) return result;
            last->next = nullptr;
        }
        
        return result;
    }
};