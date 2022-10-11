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
    fun kthSmallest(root: TreeNode, k: Int): Int {
        return traverseInorder(root, mutableListOf()).get(k-1)
    }
    
    fun traverseInorder(node: TreeNode, result: MutableList<Int>): MutableList<Int> {
        node.left?.let {
            traverseInorder(it, result)
        }
        result.add(node.`val`)
        node.right?.let {
            traverseInorder(it, result)
        }
        
        return result
    }
}