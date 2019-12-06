package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/6 19:24
 * @Description: https://leetcode-cn.com/problems/search-insert-position/
 */
public class Q35 {

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return nums[middle] < target ? middle + 1 : middle;
    }
}
