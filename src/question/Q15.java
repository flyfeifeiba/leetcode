package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/25 16:32
 * @Description: https://leetcode-cn.com/problems/3sum/
 */
public class Q15 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        //sort
        Arrays.sort(nums);
        int left;
        int right;
        int length = nums.length;

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            left = i + 1;
            right = length - 1;
            int sum = 0 - nums[i];
            while (left < right) {
                if ((nums[left] + nums[right]) == sum) {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    left++;
                    right--;
                    addList(result, list);
                } else if ((nums[left] + nums[right]) > sum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }

    private static void addList(List<List<Integer>> result, List<Integer> list) {
        for (int i = 0; i < result.size(); i++) {
            List<Integer> temp = result.get(i);
            if (temp.get(0).equals(list.get(0)) && temp.get(1).equals(list.get(1))
            &&temp.get(2).equals(list.get(2))) {
                return;
            }
        }
        result.add(list);
    }

}
