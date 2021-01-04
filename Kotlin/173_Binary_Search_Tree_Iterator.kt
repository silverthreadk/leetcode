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
class BSTIterator(root: TreeNode?) {
    val BSTList = arrayListOf<Int>()
    var index = 0
    
    init{
        inorder(root)
    }
    
    fun inorder(root: TreeNode?) {
        if(root==null) return
        
        inorder(root.left)
        BSTList.add(root.`val`)
        inorder(root.right)
    }
    
    fun next(): Int {
        return BSTList[index++]
    }

    fun hasNext(): Boolean {
        return BSTList.size > index
    }

}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * var obj = BSTIterator(root)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */