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
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        var nodeA = headA
        var nodeB = headB
        
        while (nodeA != nodeB) {
            nodeA = if (nodeA == null) headB else nodeA.next
            nodeB = if (nodeB == null) headA else nodeB.next
        }
        
        return nodeA
    }
}