/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun deepestLeavesSum(root: TreeNode?): Int {
        val queue: Queue<TreeNode> = LinkedList()
        var sum = 0
        queue.offer(root)
        
        while(queue.isNotEmpty()) {
            val n = queue.size
            sum = 0
            for(i in 0 until n) {
                val node = queue.poll()
                sum += node.`val`
                node.left?.let(queue::offer)
                node.right?.let(queue::offer)
            }
        }
    
        return sum
    }
}