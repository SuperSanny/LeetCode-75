//LeetCode: https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class FindtheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int currAlt = 0;
        int maxAlt = 0;
        for (int i = 0; i < gain.length; i++) {
            currAlt += gain[i];
            maxAlt = Math.max(maxAlt, currAlt);
        }
        return maxAlt;
    }
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
