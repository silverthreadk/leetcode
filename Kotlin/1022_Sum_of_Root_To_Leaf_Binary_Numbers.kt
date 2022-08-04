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
    fun sumRootToLeaf(root: TreeNode?): Int {
        return recursive(root, 0)
    }
    
    fun recursive(node: TreeNode?, sum: Int): Int{
        if(node == null) return 0
        if(node.left == null && node.right == null) return sum * 2 + node.`val`
        return recursive(node.left, sum * 2 + node.`val`) + recursive(node.right, sum * 2 + node.`val`)
    }
}