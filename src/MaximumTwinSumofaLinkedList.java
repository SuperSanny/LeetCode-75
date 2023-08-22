//LeetCode: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class MaximumTwinSumofaLinkedList {
    public static int pairSum(ListNode head) {
        ListNode currNode = head;
        List<Integer> list = new ArrayList<>();
        while(currNode != null){
            list.add(currNode.val);
            currNode = currNode.next;
        }
        int i = -1, n = list.size();
        int maxSum = 0;
        while(++i < n--){
            maxSum = Math.max(maxSum, list.get(i) + list.get(n));
        }
        return maxSum;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(pairSum(head));
    }
}
