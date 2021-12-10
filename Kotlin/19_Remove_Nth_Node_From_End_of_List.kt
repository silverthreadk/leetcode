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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val depth = recursive(head, n)
        
        if(depth == n) return head?.next
        
        return head
    }
    
    fun recursive(node: ListNode?, n: Int): Int {
        if(node == null) return 0
        
        val depth = recursive(node.next, n)
        if(n == depth) node.next = node.next.next
        
        return depth + 1
    }
}