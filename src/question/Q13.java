package question;


/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/22 21:30
 * @Description: https://leetcode-cn.com/problems/roman-to-integer/
 */
public class Q13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        //罗马数字
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] jinzhi = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int number = 0;
        int length = s.length();
        int i = 0;
        while(i < length) {
            for (int j = 0; j < roman.length; j++) {
                if (roman[j].length() == 1) {
                    if (s.charAt(i) == roman[j].charAt(0)) {
                        number += jinzhi[j];
                        i++;
                        break;
                    }
                } else {
                    if(i + 1 < length && s.charAt(i) == roman[j].charAt(0)
                            && s.charAt(i + 1) == roman[j].charAt(1)) {
                        number += jinzhi[j];
                        i += 2;
                        break;
                    }
                }
            }
        }
        return number;


    }
}
