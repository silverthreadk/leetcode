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
    fun isBalanced(root: TreeNode?): Boolean {
        return maxDepth(root) != -1
    }
    
    fun maxDepth(node: TreeNode?): Int {
        if (node == null) return 0

        val left = maxDepth(node.left)
        val right = maxDepth(node.right)

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1
        }

        return Math.max(left, right) + 1
    } 
}