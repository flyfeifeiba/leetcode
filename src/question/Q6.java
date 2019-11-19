package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/19 18:52
 * @Description: https://leetcode-cn.com/problems/zigzag-conversion/
 */
public class Q6 {
    public static void main(String[] args) {
        System.out.println(convert("A", 2));
    }

    public static String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int index;
        int length = s.length();

        for (int i = 0; i < numRows; i++) {
            index = i;
            if (index >= length) {
                break;
            }
            sb.append(s.charAt(index));

            while (true) {
                if (i == 0 || i == numRows - 1) {
                    index = index + numRows * 2 - 2;
                    if (index >= length) {
                        break;
                    }
                    sb.append(s.charAt(index));

                } else {
                    index = index + (numRows - i) * 2 - 2;
                    if (index >= length) {
                        break;
                    }
                    sb.append(s.charAt(index));
                    index = index + i * 2;
                    if (index >= length) {
                        break;
                    }
                    sb.append(s.charAt(index));
                }
            }
        }
        return sb.toString();
    }
}
