import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 *
 * https://leetcode-cn.com/problems/count-primes/description/
 *
 * algorithms
 * Easy (34.28%)
 * Likes:    399
 * Dislikes: 0
 * Total Accepted:    68.3K
 * Total Submissions: 197.7K
 * Testcase Example:  '10'
 *
 * 统计所有小于非负整数 n 的质数的数量。
 * 
 * 示例:
 * 
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 
 * 
 */

// @lc code=start
class Solution {

  public int countPrimes(int n) {
    boolean[] isPrimes = new boolean[n];
    Arrays.fill(isPrimes, true);

    int count = 0;
    for (int i = 2; i * i < n; i++) {
      if (isPrimes[i]) {
        for (int j = 2 * i; j < n; j += i) {
          isPrimes[j] = false;
        }
      }
    }
    for (int i = 2; i < n; i++) {
      if (isPrimes[i]) {
        count++;
      }
    }
    return count;
  }
}
// @lc code=end
