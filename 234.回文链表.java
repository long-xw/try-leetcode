import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 *
 * https://leetcode-cn.com/problems/palindrome-linked-list/description/
 *
 * algorithms
 * Easy (42.49%)
 * Likes:    592
 * Dislikes: 0
 * Total Accepted:    113.2K
 * Total Submissions: 263.8K
 * Testcase Example:  '[1,2]'
 *
 * 请判断一个链表是否为回文链表。
 * 
 * 示例 1:
 * 
 * 输入: 1->2
 * 输出: false
 * 
 * 示例 2:
 * 
 * 输入: 1->2->2->1
 * 输出: true
 * 
 * 
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
  public boolean isPalindrome(ListNode head) {
    List<Integer> list = new ArrayList<>();

    ListNode currNode = head;
    while (currNode != null) {
      list.add(currNode.val);
      currNode = currNode.next;
    }

    int back = list.size() - 1;
    int front = 0;
    while (front < back) {
      if (!list.get(front).equals(list.get(back))) {
        return false;
      }
      front++;
      back--;
    }
    return true;

  }
}
// @lc code=end
