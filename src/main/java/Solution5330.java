public class Solution5330 {

    int bestCost = 0;

    public int maxProduct(TreeNode root) {
        product(root, 0);
        return (int) bestCost % 1000000007;
    }

    void product(TreeNode root, int cache) {
        if (root == null)
            return;

        int leftSum = getSum(root.left);
        int rightSum = getSum(root.right);
        int add = cache + root.val;

        int firstSum = (leftSum + add) * rightSum;
        if (firstSum > bestCost)
            bestCost = firstSum;

        int secondSum = (rightSum + add) * leftSum;
        if (secondSum > bestCost)
            bestCost = secondSum;

        product(root.left, rightSum + add);
        product(root.right, leftSum + add);
    }

    int getSum(TreeNode root) {
        if (root == null)
            return 0;

        return root.val + getSum(root.left) + getSum(root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
