//LeetCode: https://leetcode.com/problems/max-consecutive-ones-iii/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int i=0, j=0, n=nums.length, countZeros=0,ans = Integer.MIN_VALUE;
        while(j < n){
            if(nums[j] == 0) countZeros++;
            while(countZeros > k){
                if(nums[i] == 0) countZeros--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(nums, k));
    }
}
