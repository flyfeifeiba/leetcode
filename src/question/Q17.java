package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/25 19:34
 * @Description: https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
public class Q17 {

    List<String> result = new ArrayList<>();
    Map<Integer, String> numberMap = new HashMap<Integer, String>() {
        {
            put(2, "abc");
            put(3, "def");
            put(4, "ghi");
            put(5, "jkl");
            put(6, "mno");
            put(7, "pqrs");
            put(8, "tuv");
            put(9, "wxyz");
        }

    };

    public static void main(String[] args) {
        //letterCombinations("23");
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        generateLetter("", digits, 0);
        return result;
    }

    private void generateLetter(String combination, String digits, Integer index) {
        if (digits.length() == index) {
            result.add(combination);
            return;
        }
        Integer number = Integer.valueOf(digits.charAt(index) - '0');
        String str = numberMap.get(number);
        for (int i = 0; i < str.length(); i++) {
            String newCombination = new String(combination + str.charAt(i));
            generateLetter(newCombination, digits, index + 1);
        }

    }
}
