/**
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 */

package com.rabbit;

/**
 *
 * Definition for singly-linked list.
 *
 */


public class Solution2 {

    private long getValue(ListNode l) {
        long sum = 0;
        long digit = 1;
        while(l != null) {
            sum += digit * l.val;
            l = l.next;
            digit = digit * 10;
        }
        return sum;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        long val1 = 0, val2 = 0, sum = 0;
        val1 = getValue(l1);
        val2 = getValue(l2);
        sum = val1 + val2;
        ListNode head = null;
        ListNode curNode = null;

        while (sum != 0) {
            ListNode node = new ListNode((int)(sum % 10));
            sum = sum / 10;
            if (curNode == null) {
                head = node;
            } else {
                curNode.next = node;
            }
            curNode = node;
        }
        return head;

    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode s = l1, t = l2;
        ListNode curNode = null;
        ListNode head = null;
        int carry = 0;
        while (s != null || t != null) {
            int sval = (s == null ? 0 : s.val);
            int tval = (t == null ? 0 : t.val);
            int sum = sval + tval + carry;
            ListNode node = new ListNode(sum % 10);
            if (curNode == null) {
                head = node;
                curNode = node;
            } else {
                curNode.next = node;
                curNode = node;
            }
            carry = sum / 10;
            s = (s == null ? s : s.next);
            t = (t == null ? t : t.next);

        }
        return head;

    }
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}
