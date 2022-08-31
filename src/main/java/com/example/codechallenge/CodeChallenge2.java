package com.example.codechallenge;

import org.junit.Assert;

/**
 * @author juan.yee
 */
public class CodeChallenge2 {
    public static void main(String[] args) {
        // Given
//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//        ListNode l1 = new ListNode(0);
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
//        System.out.println(l1.val + "," + l1.next.val + "," + l1.next.next.val);

//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
//        ListNode l2 = new ListNode(0);
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
//        System.out.println(l2.val + "," + l2.next.val + "," + l2.next.next.val);

        // When
        ListNode output = (new CodeChallenge2()).addTwoNumbers(l1, l2);

        // Then
        ListNode r = new ListNode(7, new ListNode(0, new ListNode(8)));
//        ListNode r = new ListNode(0);
//        System.out.println(r.val + "," + r.next.val + "," + r.next.next.val);
//        System.out.println(output.val + "," + output.next.val + "," + output.next.next.val);
    }

    /*
    * You are given two non-empty linked lists representing two non-negative integers.
    * The digits are stored in reverse order, and each of their nodes contains a single digit.
    * Add the two numbers and return the sum as a linked list.
    * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    * */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder();
        int rem = 0;
        while (l1!=null || l2!=null) {
            int sum = 0;
            if (rem == 1) {
                sum += rem;
                rem = 0;
            }
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum >= 10) {
                rem = 1;
                sum = sum - 10;
            }
            System.out.println(sum);
            sb.append(sum);
        }
        if (rem > 0) {
            System.out.println(rem);
            sb.append(rem);
        }

        return getListNodeFromString(sb.reverse().toString());
    }

    public static ListNode getListNodeFromString(String value) {
        ListNode ln = new ListNode(0);
        for (int i=0; i<value.length(); i++) {
            if (i==0) {
                ln = new ListNode(value.charAt(i) - '0');
            } else {
                ln = new ListNode(value.charAt(i) - '0', ln);
            }
        }
        return ln;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        Long num1 = Long.parseLong(getStringFromListNode(l1));
        Long num2 = Long.parseLong(getStringFromListNode(l2));
        Long sum = num1 + num2;

        return getListNodeFromString(String.valueOf(sum));
    }

    public String getStringFromListNode(ListNode ln){
        StringBuilder sb = new StringBuilder();
        while(ln != null) {
            sb.append(ln.val);
            ln = ln.next;
        }
        return sb.reverse().toString();
    }


}
