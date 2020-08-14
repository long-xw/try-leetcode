import java.util.ArrayList;
import java.util.List;

。
/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/description/
 *
 * algorithms
 * Medium (72.48%)
 * Likes:    628
 * Dislikes: 0
 * Total Accepted:    214.7K
 * Total Submissions: 296.2K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的中序 遍历。
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
 * 输出: [1,3,2]
 * 
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  private List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
      inorderTraversal1(root);
      return list;
    }
    public void inorderTraversal1(TreeNode root) {
      if (root == null){
        return;
      }
        inorderTraversal1(root.left);
      list.add(root.val);
        inorderTraversal1(root.right);
    }
}
// @lc code=end
