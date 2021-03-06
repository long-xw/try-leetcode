/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
 *
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/description/
 *
 * algorithms
 * Easy (69.16%)
 * Likes:    242
 * Dislikes: 0
 * Total Accepted:    70.2K
 * Total Submissions: 101.3K
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 
 * 如果有两个中间结点，则返回第二个中间结点。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next
 * = NULL.
 * 
 * 
 * 示例 2：
 * 
 * 输入：[1,2,3,4,5,6]
 * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
 * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 给定链表的结点数介于 1 和 100 之间。
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
  public ListNode middleNode(ListNode head) {
    // ListNode[] listNode = new ListNode[100];
    // int index = 0;
    // while (head != null) {
    // listNode[index++] = head;
    // head = head.next;
    // }
    // return listNode[index / 2];
    int index = 0;
    ListNode current = head;
    while (current != null) {
      ++index;
      current = current.next;
    }
    int curIndex = 0;
    current = head;
    while (curIndex < index / 2) {
      ++curIndex;
      current = current.next;
    }
    return current;
  }
}
// @lc code=end
