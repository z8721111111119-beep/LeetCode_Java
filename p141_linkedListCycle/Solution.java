package p141_linkedListCycle;
/*
Given head, the head of a linked list, 
determine if the linked list has a cycle in it.

Input: head = [3,2,0,-4], pos = 1 指回第二個節點
Output: true

Input: head = [3,2,0,-4]
Output: false

*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(3);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(-4);

        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode1;

        System.out.println(S1.solution(listNode0));
    }
}

//把所有走過的節點塞進set, 一但發現set有出現過 就回傳true
class S1 {
    public static boolean solution(ListNode list) {
        Set<ListNode> set = new HashSet<>();
        ListNode cur = list;
        while (cur != null) {
            if (!set.add(cur)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
