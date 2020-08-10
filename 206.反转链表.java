/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 *
 * https://leetcode-cn.com/problems/reverse-linked-list/description/
 *
 * algorithms
 * Easy (69.77%)
 * Likes:    1155
 * Dislikes: 0
 * Total Accepted:    301.8K
 * Total Submissions: 430.2K
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * 反转一个单链表。
 * 
 * 示例:
 * 
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
  public ListNode reverseList(ListNode head) {
    ListNode[] listNode = new ListNode[] {};
    ListNode cur = head;
    int index = 0;
    while (cur != null) {
      listNode[index++] = cur;
      cur = cur.next;
    }

    ListNode current = new ListNode(-1);
    for (int i = listNode.length; i > 0; i--) {
      current = listNode[i];
      current = current.next;
    }
    return current.next;

  }
}
// @lc code=end
