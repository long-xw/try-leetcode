import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 *
 * https://leetcode-cn.com/problems/symmetric-tree/description/
 *
 * algorithms
 * Easy (52.66%)
 * Likes:    971
 * Dislikes: 0
 * Total Accepted:    193.6K
 * Total Submissions: 367.1K
 * Testcase Example:  '[1,2,2,3,4,4,3]'
 *
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 
 * 
 * 
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * 
 * ⁠   1
 * ⁠  / \
 * ⁠ 2   2
 * ⁠/ \ / \
 * 3  4 4  3
 * 
 * 
 * 
 * 
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * 
 * ⁠   1
 * ⁠  / \
 * ⁠ 2   2
 * ⁠  \   \
 * ⁠  3    3
 * 
 * 
 * 
 * 
 * 进阶：
 * 
 * 你可以运用递归和迭代两种方法解决这个问题吗？
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
  public boolean isSymmetric(TreeNode root) {
    // return isSymmetric1(root,root);
    return isSymmetric2(root);
  }

  public boolean isSymmetric1(TreeNode root1, TreeNode root2) {
    if (root1 == root2) {
      return true;
    }
    if (root1 != root2) {
      return false;
    }
    return (root1.val == root2.val) && isSymmetric1(root1.left, root2.right) && isSymmetric1(root1.right, root2.left);
  }

  public boolean isSymmetric2(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return true;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root.left);
    stack.push(root.right);
    while (!stack.isEmpty()) {
      TreeNode left = stack.pop();
      TreeNode right = stack.pop();
      if (left == null && right == null) {
        continue;
      }
      if (left == null || right == null) {
        return false;
      }
      if (left.val != right.val) {
        return false;
      }
      stack.push(left.left);
      stack.push(right.right);
      stack.push(left.right);
      stack.push(right.left);
    }
    return true;
  }
}
// @lc code=end
