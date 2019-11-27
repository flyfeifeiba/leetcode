package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/26 10:36
 * @Description: https://leetcode-cn.com/problems/4sum/
 */
public class Q18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int one, two, three, four;
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (one = 0; one < length - 3; one++) {
            for (two = one + 1; two < length - 2; two++) {
                three = two + 1;
                four = length -1;
                int sum = target - nums[one] - nums[two];
                while (three < four) {
                    int temp = sum - nums[three] - nums[four];
                    if (temp == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[one]);
                        list.add(nums[two]);
                        list.add(nums[three]);
                        list.add(nums[four]);
                        addList(result, list);
                        three++;
                        four--;
                    } else if (temp > 0) {
                        three++;
                    } else {
                        four--;
                    }
                }
            }
        }


        return result;
    }

    private static void addList(List<List<Integer>> result, List<Integer> list) {
        for (int i = 0; i < result.size(); i++) {
            List<Integer> temp = result.get(i);
            if (temp.get(0).equals(list.get(0)) && temp.get(1).equals(list.get(1))
                    && temp.get(2).equals(list.get(2)) && temp.get(3).equals(list.get(3))) {
                return;
            }
        }
        result.add(list);
    }
}
