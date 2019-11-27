package question;

import model.ListNode;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/11/26 17:19
 * @Description: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class Q19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int index = delNode(head, n);
        if (index == n) {
            head = head.next;
        }
        return head;
    }

    private static int delNode(ListNode node, int n) {
        if (node == null) {
            return 0;
        }
        int index = delNode(node.next, n);

        if (index == n) {
            node.next = node.next.next;
        }
        return index + 1;
    }
}
