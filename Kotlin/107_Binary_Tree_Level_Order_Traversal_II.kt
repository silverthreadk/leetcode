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
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val result: MutableList<MutableList<Int>> = ArrayList()
        if(root == null) return result
        
        val q = LinkedList<TreeNode>()
        q.offer(root)
        
        while(!q.isEmpty()){
            val nodes = mutableListOf<Int>()
            val n = q.size
            for(i in 0 until n){
                val current = q.poll()
                nodes.add(current.`val`)
                if(current.left != null) q.add(current.left)
                if(current.right != null) q.add(current.right)
            }
            result.add(nodes)
        }
        
        return result.reversed()
    }
}