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
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        if(root == null) return 0
        
        var result = 0
        if(root.`val` >= low && root.`val` <= high) result = root.`val`
        
        return result + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
    }
}