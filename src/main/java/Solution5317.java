public class Solution5317 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root.left != null) {
            root.left = removeLeafNodes(root.left, target);
        }

        if (root.right != null) {
            root.right = removeLeafNodes(root.right, target);
        }

        boolean isLeaf = root.left == null && root.right == null;
        if (isLeaf && root.val == target) {
            root = null;
        }
        return root;
    }
}
