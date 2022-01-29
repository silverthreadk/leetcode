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
    fun minDepth(root: TreeNode?): Int {
        if(root == null) return 0
        
        if(root.left == null) return minDepth(root.right) + 1
        if(root.right == null) return minDepth(root.left) + 1
        
        return minOf(minDepth(root.left), minDepth(root.right)) + 1
    }
}