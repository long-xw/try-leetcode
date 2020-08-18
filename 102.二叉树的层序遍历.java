import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/description/
 *
 * algorithms
 * Medium (63.18%)
 * Likes:    603
 * Dislikes: 0
 * Total Accepted:    179.4K
 * Total Submissions: 283.9K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * 
 * 
 * 
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 
 * 返回其层次遍历结果：
 * 
 * [
 * ⁠ [3],
 * ⁠ [9,20],
 * ⁠ [15,7]
 * ]
 * 
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
  private List<List<Integer>> list = new ArrayList<List<Integer>>();

  public List<List<Integer>> levelOrder(TreeNode root) {
    levelOrder1(root, 0);
    return list;
  }

  public void levelOrder1(TreeNode root, int lever) {
    if (root == null) {
      return;
    }
    if (list.size() == lever) {
      list.add(new ArrayList<>());
    }
    list.get(lever).add(root.val);

    if (root.left != null) {
      levelOrder1(root.left, lever + 1);
    }
    if (root.right != null) {
      levelOrder1(root.right, lever + 1);
    }

  }
}
// @lc code=end
