//LeetCode: https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int water = 0;
        while(i < j){
            water = Math.max(water, (j-i) * Math.min(height[i], height[j]));
            if(height[i] < height[j]) i++;
            else j--;
        }
        return water;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
