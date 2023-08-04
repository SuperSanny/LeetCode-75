//LeetCode: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/?envType=study-plan-v2&envId=leetcode-75
public class LongestSubarrayof1sAfterDeletingOneElement {
    public static int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxLen = 0, c1 = 0, c2 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1) {
                c1++;
            } else {
                maxLen = Math.max(maxLen, c1 + c2);
                c2 = c1;
                c1 = 0;
            }
        }
        if( c1 + c2 == nums.length) return nums.length - 1;
        return Math.max(maxLen, c1 + c2);
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
}
