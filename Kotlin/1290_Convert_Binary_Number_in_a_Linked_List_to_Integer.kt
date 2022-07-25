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
    fun getDecimalValue(head: ListNode?): Int {
        var node = head
        var result = 0
        
        while(node != null){
            result = result * 2 + node.`val`
            node = node.next
        }
        
        return result
    }
}