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
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if(l1 == null) return l2
        if(l2 == null) return l1
        
        val result = if(l1.`val` > l2.`val`) l2 else l1
        var remain = if(l1.`val` > l2.`val`) l1 else l2
        
        var current = result
        while(current.next != null){
            if(current.next.`val` > remain.`val`){
                val temp = current.next
                current.next = remain
                remain = temp
            } else {
                current = current.next
            }
        }
        current.next = remain
        
        return result
    }
}