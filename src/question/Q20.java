package question;

import java.util.Stack;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/27 18:36
 * @Description: https://leetcode-cn.com/problems/valid-parentheses/
 */
public class Q20 {
    public static void main(String[] args) {
        isValid("()");
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            //匹配到
            if (!stack.empty() && judgeEqual(s.charAt(i), stack.peek()) ) {
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));

        }
        return stack.empty();
    }

    private static boolean judgeEqual(char a, char b) {
        if ((a == '(' && b == ')') || (a == ')' && b == '(')) {
            return true;
        }
        if ((a == '[' && b == ']') || (a == ']' && b == '[')) {
            return true;
        }
        if ((a == '{' && b == '}') || (a == '}' && b == '{')) {
            return true;
        }
        return false;

    }
}
