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
    fun longestUnivaluePath(root: TreeNode?): Int {
        if(root == null) return 0
        
        var result = maxOf(longestUnivaluePath(root.left), longestUnivaluePath(root.right))
        result = maxOf(result, recursive(root.left, root.`val`) + recursive(root.right, root.`val`))
        return result
    }
    
    fun recursive(node: TreeNode?, value: Int): Int {
        if(node == null || value != node.`val`) return 0
        
        val left = recursive(node.left, value)
        val right = recursive(node.right, value)
        return maxOf(left, right) + 1
    }
}