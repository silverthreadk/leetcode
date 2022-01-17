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
    fun bstFromPreorder(preorder: IntArray): TreeNode? {
        val root = TreeNode(preorder[0])
        for(i in 1 until preorder.size) {
            setNode(root, preorder[i])
        }
        
        return root
    }
    
    private fun setNode(node: TreeNode, value: Int) {
        if(value > node.`val`) {
            if(node.right == null) node.right = TreeNode(value)
            else setNode(node.right, value)
        }else {
            if(node.left == null) node.left = TreeNode(value)
            else setNode(node.left, value)
        }
    }
}