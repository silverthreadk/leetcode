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
    fun splitListToParts(head: ListNode?, k: Int): Array<ListNode?> {
        val result = Array<ListNode?>(k) { null }
        var n = 0
        var node = head
        
        while(node != null) {
            ++n
            node = node.next
        }
        
        val length = n / k
        val remainder = n % k
        node = head
        var last : ListNode? = null
        
        for(i in 0 until k){
            result[i] = node
            val end = length + if(i < remainder) 1 else 0
            
            for(j in 0 until end){
                last = node
                node = node?.next
            }
            
            if(last == null) return result
            
            last?.next = null
        }
        
        return result
    }
}