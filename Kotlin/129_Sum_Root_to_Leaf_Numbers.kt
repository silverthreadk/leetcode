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
    fun sumNumbers(root: TreeNode?): Int {
        return recursive(root, 0)
    }
    
    fun recursive(node: TreeNode?, num: Int): Int {
        if(node == null) return 0
        if(node.left == null && node.right == null) {
            return num * 10 + node.`val`
        }
        
        return recursive(node.left, num * 10 + node.`val`) + recursive(node.right, num * 10 + node.`val`)
    }
}