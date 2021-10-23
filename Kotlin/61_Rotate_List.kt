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
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head == null) return null

        var i = 0
        var node = head
    
        while(node?.next != null) {
            ++i
            node = node.next
        }
        node?.next = head

        node = head
        val n = i - k % (i + 1)

        for (i in 0 until n) {
            node = node?.next
        }

        val result = node?.next
        node?.next = null

        return result
    }
}