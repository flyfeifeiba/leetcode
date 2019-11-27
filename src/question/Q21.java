package question;

import model.ListNode;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/27 18:59
 * @Description: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class Q21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4);
        mergeTwoLists(l1, l2);

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = null;
        ListNode temp = null;
        int i = 0;
        while(l1 != null || l2 != null) {
            if (l1 == null ) {
                temp = new ListNode(l2.val);
                l2 = l2.next;
            }
            if (l2 == null && l1 != null) {
                temp = new ListNode(l1.val);
                l1 = l1.next;
            }
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    temp = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    temp = new ListNode(l2.val);
                    l2 = l2.next;
                }
            }
            if (i == 0) {
                result = temp;
            }
            temp = temp.next;
            i++;
        }
        return result;
    }
}
