//LeetCode: https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0, tPointer = 0;
        while(sPointer < s.length() && tPointer < t.length()) {
            if(s.charAt(sPointer) == t.charAt(tPointer)) sPointer++;
            tPointer++;
        }
        return sPointer == s.length();
    }
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
