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
    fun constructFromPrePost(pre: IntArray, post: IntArray): TreeNode? {
        var stack = Stack<TreeNode>()
        
        var root = TreeNode(pre[0])
        var current = root
        
        stack.push(current)
        
        var pre_index = 1
        var post_index = 0
        while(pre_index < pre.size){
            var found = pre.indexOfFirst({it -> it == post[post_index]})
            
            if(found < pre_index){
                current = stack.pop()
                ++post_index
            } else {
                stack.push(current)
                var child = TreeNode(pre[pre_index])
                
                if(current.left == null) {
                    current.left = child
                } else if(current.right == null) {
                    current.right = child
                }
                current = child
                ++pre_index
            }
        }
        
        return root
    }
}