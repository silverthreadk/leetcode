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
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        return recursive(root, result)
    }

    fun recursive(node: TreeNode?, result: MutableList<Int>): List<Int>{
        if(node == null) return result

        recursive(node.left, result)
        recursive(node.right, result)

        result.add(node.`val`)
        
        return result
    }
}