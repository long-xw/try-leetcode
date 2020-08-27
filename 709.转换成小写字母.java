/*
 * @lc app=leetcode.cn id=709 lang=java
 *
 * [709] 转换成小写字母
 *
 * https://leetcode-cn.com/problems/to-lower-case/description/
 *
 * algorithms
 * Easy (75.72%)
 * Likes:    130
 * Dislikes: 0
 * Total Accepted:    51.8K
 * Total Submissions: 68.4K
 * Testcase Example:  '"Hello"'
 *
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入: "Hello"
 * 输出: "hello"
 * 
 * 示例 2：
 * 
 * 
 * 输入: "here"
 * 输出: "here"
 * 
 * 示例 3：
 * 
 * 
 * 输入: "LOVELY"
 * 输出: "lovely"
 * 
 * 
 */

// @lc code=start
class Solution {
  public String toLowerCase(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] <= 90 && chars[i] >= 65) {
        chars[i] = (char) (chars[i] + 32);
      }
    }
    return String.valueOf(chars);
  }
}
// @lc code=end
