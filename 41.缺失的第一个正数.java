import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=41 lang=java
 *
 * [41] 缺失的第一个正数
 *
 * https://leetcode-cn.com/problems/first-missing-positive/description/
 *
 * algorithms
 * Hard (40.23%)
 * Likes:    693
 * Dislikes: 0
 * Total Accepted:    80K
 * Total Submissions: 199.1K
 * Testcase Example:  '[1,2,0]'
 *
 * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: [1,2,0]
 * 输出: 3
 * 
 * 
 * 示例 2:
 * 
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 
 * 
 * 示例 3:
 * 
 * 输入: [7,8,9,11,12]
 * 输出: 1
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的额外空间。
 * 
 */

// @lc code=start
class Solution {
  public int firstMissingPositive(final int[] nums) {
    // if (nums == null || nums.length == 0) {
    // return 1;
    // }
    // if (nums.length == 1) {
    // if (nums[0] == 1) {
    // return 2;
    // } else {
    // return 1;
    // }
    // }

    // Arrays.sort(nums);
    // int index = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] > 0) {
    // index = i;
    // break;
    // }
    // }
    // int j = 1;
    // for (int i = index; i < nums.length; i++) {
    // if (nums[i] != j) {
    // return j;
    // }
    // if (i != index && nums[i] != nums[i - 1]) {
    // j++;
    // }
    // }
    // return j;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        map.put(nums[i], i);
      }

    }
    for (int i = 1; i <= map.size(); i++) {
      if (!map.containsKey(i)) {
        return i;
      }
    }
    return map.size() + 1;
  }
}
// @lc code=end
