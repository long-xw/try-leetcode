import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1137 lang=java
 *
 * [1137] 第 N 个泰波那契数
 *
 * https://leetcode-cn.com/problems/n-th-tribonacci-number/description/
 *
 * algorithms
 * Easy (52.66%)
 * Likes:    43
 * Dislikes: 0
 * Total Accepted:    17K
 * Total Submissions: 32.1K
 * Testcase Example:  '4'
 *
 * 泰波那契序列 Tn 定义如下： 
 * 
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * 
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：n = 4
 * 输出：4
 * 解释：
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 * 
 * 
 * 示例 2：
 * 
 * 输入：n = 25
 * 输出：1389537
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 0 <= n <= 37
 * 答案保证是一个 32 位整数，即 answer <= 2^31 - 1。
 * 
 * 
 */

// @lc code=start
class Solution {
  private Map<Integer, Integer> cache = new HashMap<>();

  public int tribonacci(int n) {
    return tribonacci1(n);
  }

  public int tribonacci1(int n) {
    if (cache.containsKey(n)) {
      return cache.get(n);
    }
    int sum = 0;
    if (n < 2) {
      sum = n;
    } else if (n == 2) {
      sum = 1;
    } else {
      sum = tribonacci1(n - 1) + tribonacci1(n - 2) + tribonacci1(n - 3);
    }
    cache.put(n, sum);
    return sum;
  }

  public int tribonacci2(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    }
    return tribonacci2(n - 1) + tribonacci2(n - 2) + tribonacci2(n - 3);
  }

  public int tribonacci3(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    }
    int sum = 0;
    int first = 0;
    int second = 1;
    int third = 1;
    for (int i = 3; i <= n; i++) {
      sum = first + second + third;
      first = second;
      second = third;
      third = sum;
    }
    return sum;
  }

  public int tribonacci4(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    }
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 1;
    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    }
    return dp[n];
  }

}
// @lc code=end
