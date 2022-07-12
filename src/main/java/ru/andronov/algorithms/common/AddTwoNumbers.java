package ru.andronov.algorithms.common;


import ru.andronov.algorithms.common.utils.ListNode;

import java.math.BigInteger;

class AddTwoNumbers {

    public static void main(String[] args) {
        var addTwoNumberObj = new AddTwoNumbers();
        var l1 = new ListNode(2, new ListNode(4, new ListNode(9)));
        var l2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        System.out.println("l1.toString() = " + l1.toString());
        System.out.println("l2.toString() = " + l2.toString());
        var result = addTwoNumberObj.addTwoNumbers(l1, l2);
        System.out.println("result.toString() = " + result.toString());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var l1SB = new StringBuilder();
        l1SB.append(l1.val);
        var l2SB = new StringBuilder();
        l2SB.append(l2.val);
        var l1Next = l1.next;
        var l2Next = l2.next;
        while (l1Next != null || l2Next != null) {
            if (l1Next != null) {
                l1SB.append(l1Next.val);
                l1Next = l1Next.next;
            }
            if (l2Next != null) {
                l2SB.append(l2Next.val);
                l2Next = l2Next.next;
            }
        }
        var l1Result = new BigInteger(l1SB.reverse().toString());
        var l2Result = new BigInteger(l2SB.reverse().toString());
        var sumResult = l1Result.add(l2Result);
        var resultCharArray = sumResult.toString().split("");
        var curListNode = new ListNode(Integer.parseInt(resultCharArray[0]));
        ListNode result = null;
        for (int i = 1; i < resultCharArray.length; i++) {
            result = new ListNode(Integer.parseInt(resultCharArray[i]), curListNode);
            curListNode = result;
        }
        if (result == null) {
            result = curListNode;
        }
        return result;
    }
}
