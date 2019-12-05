package question;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/3 20:13
 * @Description: https://leetcode-cn.com/problems/divide-two-integers/
 */
public class Q29 {
    static Long tempDividend;
    public static void main(String[] args) {
        System.out.println(divide(-1, 1));
    }

    public static int divide(int dividend, int divisor) {
        //判断符号
        Integer flag;
        flag = (dividend < 0 ? -1 : 1) * (divisor < 0 ? -1 : 1);
        Long dividendLongValue = Math.abs(Long.valueOf(dividend));
        Long divisorLongValue = Math.abs(Long.valueOf(divisor));
        tempDividend = Long.valueOf(dividendLongValue);
        Long result = flag.longValue() * subDivide(dividendLongValue, divisorLongValue, 1L);
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return result.intValue();
    }

    private static Long subDivide(Long dividend, Long divisor, Long hex){
        Long number = 0L;
        if (divisor > dividend) {
            return 0L;
        }
        Long temp = subDivide(dividend, divisor + divisor, hex * 2);
        if (tempDividend >= divisor) {
            tempDividend = tempDividend - divisor;
            number = hex;
        }
        return temp + number;

    }

}
