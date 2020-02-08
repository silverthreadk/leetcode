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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* result = nullptr;
        stack<ListNode*> s1;
        stack<ListNode*> s2;
        ListNode* current = l1;
        while(current != nullptr) {
            s1.push(current);
            current = current->next;
        }
        current = l2;
        while(current != nullptr) {
            s2.push(current);
            current = current->next;
        }
        
        if(s1.size() < s2.size()) std::swap(s1, s2);
        current = nullptr;
        int carry = 0;
        int num1, num2;
        while(!s1.empty()) {
            if(!s1.empty()) {
                num1 = s1.top()->val;
                current = s1.top();
                s1.pop();
            } else {
                num1 = 0;
            }

            if(!s2.empty()) {
                num2 = s2.top()->val;
                s2.pop();
            } else {
                num2 = 0;
            }

            int sum = num1 + num2 + carry;
            carry = sum / 10;
            current->val = sum % 10;
            
            current->next = result;
            result = current;
        }
        
        if(carry) {
            current = new ListNode(1);
            current->next = result;
            result = current;
        }
        
        return result;
    }
};