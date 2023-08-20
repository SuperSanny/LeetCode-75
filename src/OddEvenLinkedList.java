//LeetCode : https://leetcode.com/problems/odd-even-linked-list/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);
        ListNode oddEvenList = oddEvenList(head);
        List<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        System.out.println(list);
    }
}
