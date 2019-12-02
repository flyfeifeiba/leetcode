package question;

import model.ListNode;

import java.util.List;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/2 19:36
 * @Description: https://leetcode-cn.com/problems/merge-k-sorted-lists/
 */
public class Q23 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode tempNode = null;
        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && lists[i].val < minValue) {
                minValue = lists[i].val;
                tempNode = lists[i];
                minIndex = i;
            }
        }
        if (tempNode == null) {
            return null;
        } else {
            tempNode = lists[minIndex];
            lists[minIndex] = lists[minIndex].next;
            tempNode.next = mergeKLists(lists);
            return tempNode;
        }

    }
}
