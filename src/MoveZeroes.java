//LeetCode: https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        int count=0;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] != 0) nums[count++]=nums[i];
        for(int i = count; i < nums.length; i++) nums[i] = 0;
        System.out.print(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {1, 4, 0, 5, 0, 7};
        moveZeroes(nums);
    }
}
