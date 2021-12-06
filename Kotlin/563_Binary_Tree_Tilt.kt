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
    var result = 0
    fun findTilt(root: TreeNode?): Int {
        recursive(root)
        
        return result
    }

    private fun recursive(node: TreeNode?): Int {
        if (node == null) return 0
        
        val left = recursive(node.left)
        val right = recursive(node.right)
        
		result += Math.abs(left - right);

		return left + right + node.`val`;
    }
}