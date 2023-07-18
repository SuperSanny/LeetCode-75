//LeetCode: https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75
public class GreatestCommonDivisorofStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    public static int gcd(int x, int y) {
        if(y == 0) return x;
        else return gcd(y, x % y);
    }
    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }
}
