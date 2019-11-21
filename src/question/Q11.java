package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/21 19:39
 * @Description: https://leetcode-cn.com/problems/container-with-most-water/
 */
public class Q11 {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int area;
        while (left < right) {
            //计算当前面积
            if (height[left] < height[right]) {
                area = height[left] * (right - left);
                left++;
            } else {
                area = height[right] * (right - left);
                right--;
            }
            maxArea = maxArea > area ? maxArea : area;
        }
        return maxArea;

    }
}
