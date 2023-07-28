//LeetCode: https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class MaxNumberofKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            int complement = k - num;
            if (freq.containsKey(complement) && freq.get(complement) > 0) {
                max++;
                freq.put(complement, freq.get(complement) - 1);
            } else {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }
}
