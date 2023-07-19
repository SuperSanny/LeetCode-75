//LeetCode: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;
public class KidsWiththeGreatestNumberofCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++)
            if(greatest(candies, candies[i]+extraCandies)) result.add(true);
            else result.add(false);

        return result;
    }
    public static boolean greatest(int[] arr, int num){
        for(int i = 0; i < arr.length; i++)
            if(num < arr[i]) return false;

        return true;
    }

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans);
    }
}
