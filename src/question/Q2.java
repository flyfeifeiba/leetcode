package question;

import model.ListNode;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/28 20:53
 * @Description: https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Q2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int jw = 0;
        while(l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += jw;
            jw = 0;
            if (sum >= 10) {
                sum -= 10;
                jw = 1;
            }

            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        if (jw != 0) {
            temp.next = new ListNode(jw);
        }
        return result.next;
    }
}
