import javax.swing.tree.TreeNode

class Problem5145 {
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
        fun sumEvenGrandparent(root: TreeNode?): Int {
            if (root?.`val` == null)
                return 0
            var result = 0
            if (root.`val` % 2 == 0) {
                result += root.left?.left?.`val` ?: 0
                result += root.left?.right?.`val` ?: 0
                result += root.right?.left?.`val` ?: 0
                result += root.right?.right?.`val` ?: 0
            }

            return result + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}
