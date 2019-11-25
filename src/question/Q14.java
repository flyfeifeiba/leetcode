package question;


/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/22 21:50
 * @Description: https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class Q14 {
    public static void main(String[] args) {
        String[] strs = new String[2];
        strs[0] = "aa";
        strs[1] = "a";
        System.out.print(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (true) {
            if (strs[0].length() <= index) {
                break;
            }
            char ch = strs[0].charAt(index);
            for (int i = 0; i < strs.length; i++) {
                if (index >= strs[i].length() || strs[i].charAt(index) != ch) {
                    break;
                }
                if (i == strs.length -1) {
                    sb.append(ch);
                }
            }
            if (sb.length() == index) {
                break;
            }
            index ++;
        }
        return sb.toString();


    }
}
