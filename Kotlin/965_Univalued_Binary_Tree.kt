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
    fun isUnivalTree(root: TreeNode?): Boolean {
        if(root == null) return true
        
        if(root.left != null && root.`val` != root.left.`val`) return false
        if(root.right != null && root.`val` != root.right.`val`) return false
        
        return isUnivalTree(root.left) && isUnivalTree(root.right)
    }
}