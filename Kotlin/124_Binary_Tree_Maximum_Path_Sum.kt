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
    fun maxPathSum(root: TreeNode?): Int {
        val (result, sum) = recursive(root)
        
        return result
    }
    
    fun recursive(node: TreeNode?): Pair<Int, Int> {
        if(node == null) return Pair(Int.MIN_VALUE, 0)

        val (leftMaxSum, leftPathSum) = recursive(node.left)
        val (rightMaxSum, rightPathSum) = recursive(node.right)
        val maxSum = maxOf(maxOf(leftMaxSum, rightMaxSum), node.`val` + leftPathSum + rightPathSum)
        
        return Pair(maxSum, maxOf(0, node.`val` + maxOf(leftPathSum, rightPathSum)))
    }
}