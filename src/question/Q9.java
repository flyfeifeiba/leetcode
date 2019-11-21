package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/21 16:11
 * @Description: https://leetcode-cn.com/problems/palindrome-number/
 */
public class Q9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        int length = xString.length();
        for (int i = 0; i <=  length / 2; i++) {
            if (xString.charAt(i) != xString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;

    }
}
