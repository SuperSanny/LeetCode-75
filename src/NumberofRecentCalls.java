//LeetCode: https://leetcode.com/problems/number-of-recent-calls/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;
class RecentCounter {

    LinkedList<Integer> linkedList;
    public RecentCounter() {
        this.linkedList = new LinkedList<Integer>();
    }

    public int ping(int t) {
        this.linkedList.add(t);
        while (this.linkedList.getFirst() < t - 3000) this.linkedList.removeFirst();
        return this.linkedList.size();
    }
}
public class NumberofRecentCalls {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        List<Integer> list = new ArrayList<Integer>();
        list.add(recentCounter.ping(1));
        list.add(recentCounter.ping(100));
        list.add(recentCounter.ping(3001));
        list.add(recentCounter.ping(3002));
        System.out.println(list);
    }
}
