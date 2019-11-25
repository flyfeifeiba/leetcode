package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/25 17:12
 * @Description: https://leetcode-cn.com/problems/3sum-closest/
 */
public class Q16 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, -3};
        threeSumClosest(nums, 1);
    }

    public static int threeSumClosest(int[] nums, int target) {
        //sort
        Arrays.sort(nums);
        int left;
        int right;
        int length = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            left = i + 1;
            right = length - 1;
            while (left < right) {
                int tempSum = nums[i] + nums[left] + nums[right];
                int temp = target - tempSum;
                if (temp == 0) {
                   min = 0;
                   sum = tempSum;
                   break;
                } else if (temp > 0) {
                    if (min > Math.abs(temp)) {
                        min = Math.abs(temp);
                        sum = tempSum;
                    }
                    left++;
                } else {
                    if (min > Math.abs(temp)) {
                        min = Math.abs(temp);
                        sum = tempSum;
                    }
                    right--;
                }
            }
            if (min == 0) {
                break;
            }
        }
        return sum;
    }
}
