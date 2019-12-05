package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/5 19:59
 * @Description: https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 */
public class Q33 {
    public int search(int[] nums, int target) {
        int left, middle, right;
        left = 0;
        right = nums.length - 1;
        while (left <= right) {

            middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            //左边升序
            if (nums[left] <= nums[middle]) {
                if (nums[middle] >= target && target >= nums[left]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (nums[right] >= target && target >= nums[middle]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

        }
        return -1;
    }
}
