import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 *
 * https://leetcode-cn.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (66.74%)
 * Likes:    336
 * Dislikes: 0
 * Total Accepted:    95.6K
 * Total Submissions: 142.7K
 * Testcase Example:  '5'
 *
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 
 * 
 * 
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 
 * 示例:
 * 
 * 输入: 5
 * 输出:
 * [
 * ⁠    [1],
 * ⁠   [1,1],
 * ⁠  [1,2,1],
 * ⁠ [1,3,3,1],
 * ⁠[1,4,6,4,1]
 * ]
 * 
 */

// @lc code=start
class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    if (numRows == 0) {
      return list;
    }

    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list.add(list1);

    for (int i = 1; i < numRows; i++) {
      List<Integer> beforeList = list.get(list.size() - 1);
      List<Integer> currentList = new ArrayList<>();

      currentList.add(1);
      for (int j = 1; j < beforeList.size(); j++) {
        currentList.add(beforeList.get(j - 1) + beforeList.get(j));
      }
      currentList.add(1);
      list.add(currentList);
    }
    return list;
  }
}

// @lc code=end
