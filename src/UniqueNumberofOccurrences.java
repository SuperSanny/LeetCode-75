//LeetCode: https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class UniqueNumberofOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
        Set<Integer> set = new HashSet<>();
        System.out.println(map);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) set.add(entry.getValue());
        System.out.println(set);
        if(set.size() == map.size()) return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(uniqueOccurrences(arr));
    }
}
