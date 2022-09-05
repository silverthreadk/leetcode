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
    fun increasingBST(root: TreeNode?): TreeNode? {
        return recursive(root, null)
    }
    
    fun recursive(node: TreeNode?, prev: TreeNode?): TreeNode? {
        if(node == null) return prev
        
        val left = recursive(node.left, node)
        node.left = null
        node.right = recursive(node.right, prev)
        
        return left
    }
}