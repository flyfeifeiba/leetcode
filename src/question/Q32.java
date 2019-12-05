package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/5 9:54
 * @Description: https://leetcode-cn.com/problems/longest-valid-parentheses/
 */
public class Q32 {
    public int longestValidParentheses(String s) {
        int length = s.length();
        int[] dp = new int[length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                dp[i] = 0;
            } else {
                if ((i - 1) > 0 && s.charAt(i - 1) == '(') {
                    dp[i] = (i - 2) >= 0 ? dp[i - 2] + 2 : 0 + 2;
                } else if (i >= 1 && (i - dp[i - 1] - 1) >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + 2;
                    if (i >= dp[i]) {
                        dp[i] += dp[i - dp[i]];
                    }
                } else {
                    dp[i] = 0;
                }
            }
        }
        return max(dp);
    }

    private int max(int[] dp) {
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }

}
