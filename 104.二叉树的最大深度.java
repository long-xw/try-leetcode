/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 *
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/description/
 *
 * algorithms
 * Easy (74.81%)
 * Likes:    670
 * Dislikes: 0
 * Total Accepted:    257.9K
 * Total Submissions: 344.6K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * 给定一个二叉树，找出其最大深度。
 * 
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 
 * 说明: 叶子节点是指没有子节点的节点。
 * 
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 返回它的最大深度 3 。
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
  private int max;

  public int maxDepth(TreeNode root) {
    // maxDepth1(root, 1);
    // return max;
    return maxDepth2(root);
  }

  public void maxDepth1(TreeNode root, int lever) {
    if (root == null) {
      return;
    }
    max = Math.max(max, lever);
    if (root.left != null) {
      maxDepth1(root.left, lever + 1);
    }
    if (root.right != null) {
      maxDepth1(root.right, lever + 1);
    }
  }

  public int maxDepth2(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left, right) + 1;
  }
}
// @lc code=end
