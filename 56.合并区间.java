import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 *
 * https://leetcode-cn.com/problems/merge-intervals/description/
 *
 * algorithms
 * Medium (42.67%)
 * Likes:    520
 * Dislikes: 0
 * Total Accepted:    121K
 * Total Submissions: 283.3K
 * Testcase Example:  '[[1,3],[2,6],[8,10],[15,18]]'
 *
 * 给出一个区间的集合，请合并所有重叠的区间。
 * 
 * 示例 1:
 * 
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 
 * 
 * 示例 2:
 * 
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * 
 */

// @lc code=start
class Solution {

    public int[][] merge(final int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // 1. 如何排序， 2.如果进行自定义排序 xccc
        // Collections.sort, Arrays.sort, java8高级写法： lambd表达式
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                return o1[0] - o2[0];

            }
        });

        // 3.如果构造动态数组，4. 二维数组与一维数组的遍历
        final List<int[]> retList = new ArrayList<int[]>();

        // 5.选一个基准点
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            // int[] temp = intervals[i];
            
            final int startI = intervals[i][0];
            final int endI = intervals[i][1];
            if (end >= startI) { // 处理[1,3],[2,6]  ==> [1, 6]
                if (endI > end) {  // 处理[1,4],[2,3] ==> [1, 4]
                    end = endI;
                }
            } else {
                // save start, end
                final int[] item = new int[] { start, end };
                retList.add(item);
                start = startI;
                end = endI;
            }

            // 6.处理最后一个元素，上面逻辑的漏洞
            if (i == intervals.length - 1) {
                final int[] item = new int[] { start, end };
                retList.add(item);
            }
        }

        // 7. 如果转换成符合输出的结果值： ArraryList 转换成Array[]
        int[][] retVals = new int[retList.size()][2];

        for (int i = 0; i < retList.size(); i++) {
            retVals[i] = retList.get(i);
        }
        return retVals;
    }
}

// @lc code=end
