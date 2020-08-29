import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
 *
 * https://leetcode-cn.com/problems/invert-binary-tree/description/
 *
 * algorithms
 * Easy (76.19%)
 * Likes:    538
 * Dislikes: 0
 * Total Accepted:    108K
 * Total Submissions: 141.5K
 * Testcase Example:  '[4,2,7,1,3,6,9]'
 *
 * 翻转一棵二叉树。
 * 
 * 示例：
 * 
 * 输入：
 * 
 * ⁠    4
 * ⁠  /   \
 * ⁠ 2     7
 * ⁠/ \   / \
 * 1   3 6   9
 * 
 * 输出：
 * 
 * ⁠    4
 * ⁠  /   \
 * ⁠ 7     2
 * ⁠/ \   / \
 * 9   6 3   1
 * 
 * 备注:
 * 这个问题是受到 Max Howell 的 原问题 启发的 ：
 * 
 * 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
  public TreeNode invertTree(TreeNode root) {
    return invertTree2(root);
  }

  public TreeNode invertTree1(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
      return root;
    }
    TreeNode temp1 = invertTree1(root.left);
    TreeNode temp2 = invertTree1(root.right);
    root.left = temp2;
    root.right = temp1;
    return root;
  }

  public TreeNode invertTree2(TreeNode root) {
    if (root == null) {
      return null;
    }
    Stack<TreeNode> stack = new Stack();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode current = stack.pop();
      TreeNode tmp1 = current.left;
      current.left = current.right;
      current.right = tmp1;
      if (current.left != null) {
        stack.push(current.left);
      }
      if (current.right != null) {
        stack.push(current.right);
      }
    }
    return root;
  }
}
// @lc code=end
