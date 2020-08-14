import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/description/
 *
 * algorithms
 * Medium (66.50%)
 * Likes:    343
 * Dislikes: 0
 * Total Accepted:    150.5K
 * Total Submissions: 226.4K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的 前序 遍历。
 * 
 * 示例:
 * 
 * 输入: [1,null,2,3]  
 * ⁠  1
 * ⁠   \
 * ⁠    2
 * ⁠   /
 * ⁠  3 
 * 
 * 输出: [1,2,3]
 * 
 * 
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
  private List<Integer> list = new ArrayList<>();

  public List<Integer> preorderTraversal(TreeNode root) {
    preorderTraversal1(root);
    return list;

  }

  public void preorderTraversal1(TreeNode root) {
    if (root == null) {
      return;
    }
    list.add(root.val);
    preorderTraversal1(root.left);
    preorderTraversal1(root.right);
  }

}
// @lc code=end
