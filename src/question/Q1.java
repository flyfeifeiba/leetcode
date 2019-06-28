package question;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/28 20:09
 * @Description: https://leetcode-cn.com/problems/two-sum/
 */
public class Q1 {
    /**
     * 思路：利用map来实现O(1)的查找
     */
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer, Integer> numMap = new HashMap();
        int index = 0;
        for (int num : nums) {
            numMap.put(num, index++);
        }

        index = 0;
        for (int num : nums) {
            if (numMap.get(target - num) == null) {
                index ++;
                continue;
            }

            int indexTwo = numMap.get(target - num);


            if (index == indexTwo) {
                index ++;
                continue;
            }

            result[0] = index > indexTwo ? indexTwo : index;
            result[1] = index > indexTwo ? index : indexTwo;
            break;

        }
        return result;

    }

//    public static void main(String[] args) {
//        int[] nums = {3,2,4};
//        twoSum(nums, 6);
//    }

}
