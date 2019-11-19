package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/7/11 17:34
 * @Description: https://leetcode-cn.com/problems/count-numbers-with-unique-digits/
 */
public class Q357 {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int[] dp = new int[10];
        dp[0] = 10;
        n = n > 10 ? 10 : n;
        for (int i = 1; i < n; i++) {
            dp[i] = 0;
            if (i == 1) {
                dp[i] += (dp[i - 1] - 1) * (10 - i);
            } else {
                dp[i] += dp[i - 1] * (10 - i);
            }

        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += dp[i];
        }

        return result;
    }

    private static void testException() throws Exception{
        int i = 0;
        if (i == 0) {
            throw new Exception();
        }
    }

    public static void main(String[] args) throws Exception {
        testException();
    }
}
