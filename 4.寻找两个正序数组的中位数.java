import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 *
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/description/
 *
 * algorithms
 * Hard (38.78%)
 * Likes:    3278
 * Dislikes: 0
 * Total Accepted:    269.8K
 * Total Submissions: 694.9K
 * Testcase Example:  '[1,3]\n[2]'
 *
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
 * 
 * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 
 * 
 * 示例 2：
 * 
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * 
 * 
 * 示例 3：
 * 
 * 输入：nums1 = [0,0], nums2 = [0,0]
 * 输出：0.00000
 * 
 * 
 * 示例 4：
 * 
 * 输入：nums1 = [], nums2 = [1]
 * 输出：1.00000
 * 
 * 
 * 示例 5：
 * 
 * 输入：nums1 = [2], nums2 = []
 * 输出：2.00000
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 * 
 * 
 */

// @lc code=start
class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // int[] nums3 = new int[nums1.length + nums2.length];
    // for (int i = 0; i < nums1.length; i++) {
    // nums3[i] = nums1[i];
    // }
    // int a = nums1.length;
    // int b = nums2.length;
    // for (int i = 0; i < nums2.length; i++) {
    // nums3[a] = nums2[i];
    // a++;
    // }
    int a = nums1.length;
    int b = nums2.length;
    int[] nums3 = new int[a + b];
    for (int i = 0; i < a; i++)
      nums3[i] = nums1[i];
    int d = a;
    for (int i = 0; i < b; i++) {
      nums3[d] = nums2[i];
      d++;
    }
    Arrays.sort(nums3);
    double result = 0;
    if ((a + b) % 2 == 0) {
      double f = nums3[(a + b) / 2 - 1] + nums3[(a + b) / 2];
      result = f / 2;
    } else {
      result = nums3[(a + b) / 2];
    }
    return result;
  }

}
// @lc code=end
