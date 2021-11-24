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
    fun numComponents(head: ListNode?, nums: IntArray): Int {      
        var result = 0
        val s = nums.toMutableSet()
        var node = head
        var prev = false

        while (node != null) {
            val found = s.contains(node.`val`)
            if(!prev && found) ++result
            prev = found
            node = node.next
        }
        
        return result
    }
}
