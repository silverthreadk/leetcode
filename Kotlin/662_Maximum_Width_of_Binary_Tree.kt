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
    fun widthOfBinaryTree(root: TreeNode?): Int {
        if (root == null) return 0

        var width = 1
        val q = LinkedList<Pair<TreeNode, Int>>()
        q.offer(Pair(root, 1))

        while(!q.isEmpty()){
            val n = q.size
            width = maxOf(width, q.last.second - q.first.second + 1)
            for(i in 0 until n) {
                val node = q.first.first
                val index = q.first.second
                q.pop()
                if(node.left != null) q.offer(Pair(node.left, index * 2 - 1))
                if(node.right != null) q.offer(Pair(node.right, index * 2))
            }
        }
        return width
    }
}