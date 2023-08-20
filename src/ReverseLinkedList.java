//LeetCode: https://leetcode.com/problems/reverse-linked-list/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);
        ListNode reverseList = reverseList(head);
        List<Integer> list = new ArrayList<Integer>();
        while(reverseList != null){
            list.add(reverseList.val);
            reverseList = reverseList.next;
        }
        System.out.println(list);
    }
}
