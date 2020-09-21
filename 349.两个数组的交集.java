import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 *
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/description/
 *
 * algorithms
 * Easy (70.50%)
 * Likes:    231
 * Dislikes: 0
 * Total Accepted:    94.2K
 * Total Submissions: 133.2K
 * Testcase Example:  '[1,2,2,1]\n[2,2]'
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 
 * 
 * 示例 2：
 * 
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 
 * 
 * 
 * 说明：
 * 
 * 
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 * 
 * 
 */

// @lc code=start
class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<>();
    for (Integer i : nums1) {
      set1.add(i);
    }
    HashSet<Integer> set2 = new HashSet<>();
    for (Integer i : nums2) {
      set2.add(i);
    }
    set1.retainAll(set2);
    int[] arr = new int[set1.size()];
    int index = 0;
    for (int i : set1) {
      arr[index++] = i;
    }
    return arr;

  }
}
// @lc code=end
