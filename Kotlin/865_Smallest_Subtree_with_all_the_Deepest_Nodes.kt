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
    fun subtreeWithAllDeepest(root: TreeNode?): TreeNode? {
        val pair = recursive(root)
        return pair.second
    }
    
    fun recursive(node: TreeNode?): Pair<Int, TreeNode?> {
        if(node == null) return Pair(0, null)
        
        val left = recursive(node.left)
        val right = recursive(node.right)
        
        if(left.first == right.first) return Pair(left.first+1, node)
        else if(left.first > right.first) return Pair(left.first+1, left.second)
        else return Pair(right.first+1, right.second)
    }
}