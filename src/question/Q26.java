package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/3 13:51
 * @Description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class Q26 {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int lastNumber = nums[0];
        int left = 1;
        for (int i = 1; i < length; i++) {
            if (lastNumber != nums[i]) {
                nums[left] = nums[i];
                lastNumber = nums[i];
                left++;
            }
        }

        return left;
    }
}
