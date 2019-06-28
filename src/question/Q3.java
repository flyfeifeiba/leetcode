package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/28 21:23
 * @Description: https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class Q3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int maxLength = 1;
        int leftIndex = 0;
        int rightIndex = 0;
        while(true) {
            if (rightIndex >= s.length() - 1) {
                break;
            }

            //不存在
            int equalIndex = equalIndex(s, leftIndex, rightIndex, s.charAt(rightIndex + 1));
            if (equalIndex == -1) {
                rightIndex ++;
                int length = rightIndex -leftIndex + 1;
                maxLength = maxLength > length ? maxLength : length;
            } else {
                leftIndex = equalIndex + 1;
                rightIndex ++;
            }

        }
        return maxLength;
    }

    static int equalIndex(String s, int leftIndex, int rightIndex, char target) {
        for (int i = leftIndex; i <= rightIndex; i ++) {
            if (s.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("acbsss");
    }


}
