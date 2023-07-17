//LeetCode: https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length(), m = word2.length();
        int i = 0, j = 0;
        while (i < n || j < m) {
            if(i < n) sb.append(word1.charAt(i++));
            if(j < m) sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        String ans = mergeAlternately(word1, word2);
        System.out.println(ans);
    }
}
