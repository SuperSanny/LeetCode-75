//LeetCode: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class DeletetheMiddleNodeofaLinkedList {
    public static ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        int count = 0;
        ListNode turtle = head, rabbit = head;
        while(turtle != null) {
            count++;
            turtle = turtle.next;
        }
        int mid = count/2;
        for(int i=0; i<mid-1; i++) {
            rabbit = rabbit.next;
        }
        rabbit.next = rabbit.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);

        ListNode deleteNode = deleteMiddle(head);
        List<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        System.out.println(list);
    }

}
