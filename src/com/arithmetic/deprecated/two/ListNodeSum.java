package com.arithmetic.deprecated.two;

/**
 * Created by lijinxiong on 2019/11/8
 * https://leetcode-cn.com/problems/add-two-numbers/solution/hua-jie-suan-fa-2-liang-shu-xiang-jia-by-guanpengc/
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class ListNodeSum {


//    给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
//如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
//您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//示例：
//
//输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807


    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode oneListNode, ListNode twoListNode) {

        ListNode pre = new ListNode(0);
        ListNode cur = pre;

        // 进位
        int carry = 0;

        while (oneListNode != null || twoListNode != null) {

            int x = oneListNode == null ? 0 : oneListNode.val;
            int y = twoListNode == null ? 0 : twoListNode.val;

            int sum = x + y + carry;

            // 进位
            carry = sum / 10;

            // 个位
            sum = sum % 10;

            cur.next = new ListNode(sum);
            cur = cur.next;


            if (oneListNode != null) {
                oneListNode = oneListNode.next;
            }

            if (twoListNode != null) {
                twoListNode = twoListNode.next;
            }


        }


        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
