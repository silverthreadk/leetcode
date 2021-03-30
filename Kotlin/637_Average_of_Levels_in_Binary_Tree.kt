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
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val result = ArrayList<Double>()
        val q = ArrayDeque<TreeNode>()
        q.offer(root)
        
        while(!q.isEmpty()){
            val n = q.size
            var sum = 0L
            
            for(i in 0 until n){
                val node = q.poll()
                sum += node.`val`
                if(node.left != null) q.offer(node.left)
                if(node.right != null) q.offer(node.right)
            }
            
            result.add(sum / n.toDouble())
        }
        
        return result.toDoubleArray()
    }
}