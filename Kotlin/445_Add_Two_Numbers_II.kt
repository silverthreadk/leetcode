/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var result : ListNode? = null
        if(l1 == null) return l2
        if(l2 == null) return l1
        
        var s1 = Stack<ListNode>()
        var s2 = Stack<ListNode>()
        
        var current = l1
        while (current != null) {
            s1.push(current)
            current = current.next
        }
        
        current = l2
        while (current != null) {
            s2.push(current)
            current = current.next
        }
        
        if(s1.size <s2.size) {
            val s3 = s2
            s2 = s1
            s1 = s3
        }
        current = null
        var carry = 0
        while (!s1.empty()) {
            var sum = carry
            if(!s1.empty()) {
                current = s1.pop()
                sum += current.`val`
            }
            if(!s2.empty()) {
                sum += s2.pop().`val`
            }
            
            carry = sum / 10
            current?.`val` = sum % 10
            
            current?.next = result
            result = current
        }
        
        if(carry > 0) {
            current = ListNode(1)
            current.next = result
            result = current
        }
        return result
    }
}