package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/4 20:01
 * @Description: https://leetcode-cn.com/problems/substring-with-concatenation-of-all-words/
 */
public class Q30 {

    public List<Integer> findSubstring(String s, String[] words) {
        if (words.length == 0) {
            return new ArrayList<>();
        }
        int wordsLengthSum = words.length * words[0].length();
        if (s.length() < wordsLengthSum) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int left;
        for (int i = 0; i <= s.length() - wordsLengthSum; i++) {

            left = i;

            List<String> stringList = initList(words);
            boolean flag = true;
            while (flag && stringList.size() != 0) {
                flag = false;
                for (String str : stringList) {
                    if (s.substring(left, left + words[0].length()).equals(str)) {
                        stringList.remove(str);
                        flag = true;
                        break;
                    }
                }
                left = left + words[0].length();
            }
            if (flag) {
                result.add(i);
            }
        }
        return result;

    }

    private List<String> initList(String[] words) {
        List<String> result = new ArrayList<>();
        for (String str : words) {
            result.add(str);
        }
        return result;
    }
}
