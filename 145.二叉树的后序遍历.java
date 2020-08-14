import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/description/
 *
 * algorithms
 * Hard (72.18%)
 * Likes:    372
 * Dislikes: 0
 * Total Accepted:    107.5K
 * Total Submissions: 148.9K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的 后序 遍历。
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
 * 输出: [3,2,1]
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

  public List<Integer> postorderTraversal(TreeNode root) {
    postorderTraversal1(root);
    return list;
  }

  public void postorderTraversal1(TreeNode root) {
    if (root == null) {
      return;
    }
    postorderTraversal1(root.left);
    postorderTraversal1(root.right);
    list.add(root.val);
  }
}
// @lc code=end
