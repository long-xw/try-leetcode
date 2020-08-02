/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (38.43%)
 * Likes:    1186
 * Dislikes: 0
 * Total Accepted:    320.7K
 * Total Submissions: 833.2K
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1:
 * 
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 
 * 
 * 示例 2:
 * 
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 
 * 
 * 说明:
 * 
 * 所有输入只包含小写字母 a-z 。
 * 
 */

// @lc code=start
class Solution {
  public String longestCommonPrefix(String[] strs) {

    if (strs.length == 0) {
      return "";
    }

    String str0 = strs[0];
    char[] str = str0.toCharArray();

    for (int i = 0; i < str.length; i++) {
      for (int j = 1; j < strs.length; j++) {
        if (strs[j].length() < i + 1) {
          return strs[j];
        }

        if (str[i] == strs[j].charAt(i)) {
          continue;
        } else {
          return str0.substring(0, i);
        }
      }
    }
    return str0;

  }
}
// @lc code=end
