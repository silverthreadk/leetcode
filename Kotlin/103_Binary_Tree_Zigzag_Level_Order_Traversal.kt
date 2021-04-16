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
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        if(root == null) return result
    
        val q = ArrayDeque<TreeNode>()
        var isForward = true
        q.offer(root)
        
        while(!q.isEmpty()){
            val n = q.size
            val temp = ArrayList<Int>()
            for(i in 0 until n){
                val index = if(isForward) i else n - i - 1
                val current = q.poll()
                temp.add(current.`val`)
                current.left?.let{q.offer(current.left)}
                current.right?.let{q.offer(current.right)}
            }
            
            if(isForward) result.add(temp)
            else result.add(temp.reversed())
            isForward = !isForward
        }

        return result
    }
}