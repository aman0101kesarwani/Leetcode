/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//  mirror of a BT (GFG)
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode left, TreeNode right) {

        // Both are null → symmetric
        if (left == null && right == null) {
            return true;
        }

        // One is null → not symmetric
        if (left == null || right == null) {
            return false;
        }

        // Values must be equal
        if (left.val != right.val) {
            return false;
        }

        // Mirror condition:
        // left's LEFT  ↔ right's RIGHT
        // left's RIGHT ↔ right's LEFT
        return helper(left.left, right.right)
            && helper(left.right, right.left);
    }
}