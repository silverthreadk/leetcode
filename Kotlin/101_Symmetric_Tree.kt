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
    fun isSymmetric(root: TreeNode?): Boolean {
        val q = LinkedList<TreeNode?>()
        
        q.offer(root)
        q.offer(root)
        
        while(q.isNotEmpty()){
            val left = q.poll()
            val right = q.poll()
            
            if (left == null && right == null) continue
            if (left == null || right == null) return false
            if (left?.`val` != right?.`val`) return false
            
            q.offer(left?.left)
            q.offer(right?.right)
            q.offer(left?.right)
            q.offer(right?.left)
        }
        
        return true
    }
}