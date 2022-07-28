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
    fun isValidBST(root: TreeNode?): Boolean {
        return recursive(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }
    
    private fun recursive(root: TreeNode?, min: Long, max: Long): Boolean {
        if(root == null) return true
        if(root?.`val` >= max) return false
        if(root?.`val` <= min) return false
        return recursive(root?.left, min, root?.`val`.toLong()) && recursive(root?.right, root?.`val`.toLong(), max)
    }
}