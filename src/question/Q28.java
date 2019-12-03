package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/3 14:58
 * @Description: https://leetcode-cn.com/problems/implement-strstr/
 */
public class Q28 {


    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if (haystackLength < needleLength) {
            return -1;
        }

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (judgeEqual(haystack, needle, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean judgeEqual(String haystack, String needle, int index) {
        boolean flag = false;
        for (int i = 0; i < needle.length(); i++) {
            if (haystack.charAt(index + i) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
