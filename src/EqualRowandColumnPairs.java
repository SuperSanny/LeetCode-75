//LeetCode: https://leetcode.com/problems/equal-row-and-column-pairs/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class EqualRowandColumnPairs {
    public static int equalPairs(int[][] grid) {
        int count = 0, n = grid.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean match = true;
                int k = 0;
                while(k < n){
                    if(grid[i][k] != grid[k][j]) {
                        match = false;
                        break;
                    }
                    k++;
                }
                count += match ? 1 : 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(equalPairs(grid));
    }
}
