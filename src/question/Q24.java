package question;

import model.ListNode;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/2 20:09
 * @Description: https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class Q24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = head.next;
        ListNode tempNode = head.next.next;
        head.next.next = head;
        head.next = tempNode;
        swapPairs(tempNode);
        return result;
    }
}
