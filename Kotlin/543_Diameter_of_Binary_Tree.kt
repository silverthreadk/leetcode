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
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        val (maxDepth, diameter) = recursive(root)
        
        return diameter
    }
    
    fun recursive(node: TreeNode?): Pair<Int, Int> {
        if(node==null) return Pair(0, 0)
        
        val (maxDepthLeft, diameterLeft) = recursive(node.left)
        val (maxDepthRight, diameterRight) = recursive(node.right)

        var maxDepth = maxOf(maxDepthLeft, maxDepthRight) + 1
        var diameter = maxOf(diameterLeft, diameterRight, maxDepthLeft + maxDepthRight)

        return Pair(maxDepth, diameter)
    }
}