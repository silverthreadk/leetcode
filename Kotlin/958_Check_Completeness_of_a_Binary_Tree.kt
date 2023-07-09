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
    var count = 0
    fun isCompleteTree(root: TreeNode?): Boolean {
        return recursive(root, 1) == count
    }

    fun recursive(node: TreeNode?, index: Int): Int {
        if (node == null) return 0
        
        ++count
        return maxOf(maxOf(index, recursive(node.left, 2 * index)), recursive(node.right, 2 * index + 1))
    }
}