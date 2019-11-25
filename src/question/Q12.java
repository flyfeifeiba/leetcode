package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/22 21:00
 * @Description: https://leetcode-cn.com/problems/integer-to-roman/
 */
public class Q12 {

    public static void main(String[] args) {
        System.out.print(intToRoman(111));
    }


    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        //罗马数字
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] jinzhi = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int number;
        int i = 0;
        while(num > 0) {
            number = num / jinzhi[i];
            for (int j = 0; j < number; j++) {
                sb.append(roman[i]);
            }
            num = num - number * jinzhi[i];
            i++;
        }
        return sb.toString();


    }

}
