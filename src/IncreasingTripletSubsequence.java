//Leetode: https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= firstSmallest) firstSmallest = num;
            else if (num <= secondSmallest) secondSmallest = num;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));
    }
}
