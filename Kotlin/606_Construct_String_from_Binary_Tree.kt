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
    fun tree2str(root: TreeNode?): String {
        return when {
            root == null -> ""
            root.left == null && root.right == null -> root.`val`.toString()
            root.right == null -> root.`val`.toString() + "(" + tree2str(root.left) + ")"
            else -> root.`val`.toString() + "(" + tree2str(root.left) + ")(" + tree2str(root.right) + ")"
        }  
    }
}