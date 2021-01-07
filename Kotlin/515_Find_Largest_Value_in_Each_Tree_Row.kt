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
    fun largestValues(root: TreeNode?): List<Int> {
        val result: MutableList<Int> = mutableListOf()
        if(root == null) return result
        
        val q = LinkedList<TreeNode>()
        q.offer(root)
        
        while(!q.isEmpty()){
            val n = q.size
            var max_value = q.peek().`val`
            for(i in 0 until n){
                val current = q.pop()
                max_value = Math.max(max_value, current.`val`)
                if(current.left != null) q.offer(current.left)
                if(current.right != null) q.offer(current.right)
            }
            result.add(max_value)
        }
        
        return result
    }
}