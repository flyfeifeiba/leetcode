package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/7/11 16:51
 * @Description: https://leetcode-cn.com/problems/maximum-subarray/
 */
public class Q53 {
    public int maxSubArray(int[] nums) {

        int result = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            result = result > sum ? result : sum;
        }



        return result;

    }


}
