package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/5 20:00
 * @Description: https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class Q34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findLeft(nums, target);
        result[1] = findRight(nums, target);
        return result;
    }

    private int findLeft(int[] nums, int target) {
        int left, middle, right;
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            } else  if(nums[middle] < target){
                left = middle + 1;
            } else {
                if ((middle == 0) || (nums[middle - 1] != target)) {
                    return middle;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }

    private int findRight(int[] nums, int target) {
        int left, middle, right;
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            } else  if(nums[middle] < target){
                left = middle + 1;
            } else {
                if ((middle == nums.length - 1) || (nums[middle + 1] != target)) {
                    return middle;
                } else {
                    left = middle + 1;
                }
            }
        }
        return -1;
    }
}
