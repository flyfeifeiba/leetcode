package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/20 17:46
 * @Description: https://leetcode-cn.com/problems/string-to-integer-atoi/
 */
public class Q8 {
    public static void main(String[] args) {
        System.out.println(myAtoi(" -42"));
    }

    public static  int myAtoi(String str) {
        boolean startFlag = true;
        Long sum = 0L;
        int flag = 1;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && startFlag) {
                continue;
            }
            if (str.charAt(i) == '-' && startFlag) {
                flag = -1;
                startFlag = false;
                continue;
            }
            if (str.charAt(i) == '+' && startFlag) {
                flag = 1;
                startFlag = false;
                continue;
            }
            startFlag = false;
            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
                sum = sum * 10 + str.charAt(i) - '0';

                if (flag * sum > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (flag * sum  < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }


        return sum.intValue() * flag;

    }
}
