package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/20 15:47
 * @Description: https://leetcode-cn.com/problems/reverse-integer/
 */
public class Q7 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        String value = String.valueOf(x);
        StringBuilder newValue = new StringBuilder();
        int min = 0;
        if (value.charAt(0) == '-') {
            newValue.append("-");
            min = 1;
        }
        for (int i = value.length() - 1; i >= min; i--) {
            newValue.append(value.charAt(i));
        }
        Long longValue = Long.valueOf(newValue.toString());
        if (longValue > Integer.MAX_VALUE || longValue < Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.valueOf(newValue.toString());

    }
}
