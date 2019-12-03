package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/3 14:46
 * @Description: https://leetcode-cn.com/problems/remove-element/
 */
public class Q27 {

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }

        int left = 0;
        for (int i = 0; i < length; i++) {
            if (val != nums[i]) {
                nums[left] = nums[i];
                left++;
            }
        }

        return left;
    }
}
