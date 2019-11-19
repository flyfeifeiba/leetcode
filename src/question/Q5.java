package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/19 14:44
 * @Description: https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class Q5 {

    public static void main(String[] args) {

        System.out.println(longestPalindrome("cbbd"));


    }


    public static  String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        //dp[i][j]标识s[i][j]是否是回文序列
        boolean dp[][] = new boolean[1000][1000];
        int maxLength = 1;
        int maxI = 0;
        int maxJ = 0;
        int length;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                length = j - i;
                if (length == 0) {
                    dp[i][j] = true;
                } else if (length == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                }
                if (dp[i][j]) {
                    if ((length + 1) > maxLength) {
                        maxLength = length + 1;
                        maxI = i;
                        maxJ = j;
                    }
                }


            }
        }
        return s.substring(maxI, maxJ + 1);


    }
}
