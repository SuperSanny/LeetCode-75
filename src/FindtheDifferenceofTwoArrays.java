//LeetCode: https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class FindtheDifferenceofTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElements(nums1, nums2), getElements(nums2, nums1));
    }
    static List<Integer> getElements(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums2) set2.add(num);
        for(int num : nums1) {
            if(!set2.contains(num)) set1.add(num);
        }
        return new ArrayList<>(set1);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifference(nums1, nums2));
    }

}
