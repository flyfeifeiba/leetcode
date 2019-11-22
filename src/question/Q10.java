package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/21 19:53
 * @Description: https://leetcode-cn.com/problems/regular-expression-matching/
 */
public class Q10 {

    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean first_match = (!s.isEmpty() &&
                (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*'){
            return (isMatch(s, p.substring(2)) ||
                    (first_match && isMatch(s.substring(1), p)));
        } else {
            return first_match && isMatch(s.substring(1), p.substring(1));
        }

    }
}
