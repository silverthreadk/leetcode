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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (root == null) return result
        
        val q = LinkedList<TreeNode>()
        q.add(root)

        while (q.isNotEmpty()) {
            val n = q.size
            val temp = mutableListOf<Int>()
            for(i in 0 until n) {
                val node = q.remove()
                temp.add(node.`val`)
                
                if (node.left != null) q.add(node.left!!)
                if (node.right != null) q.add(node.right!!)
            }

             result.add(temp)
        }

        return result
    }
}