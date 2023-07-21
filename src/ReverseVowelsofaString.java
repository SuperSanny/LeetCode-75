//LeetCode: https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class ReverseVowelsofaString {
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String vowels = "aeiouAEIOU";
        for(char c : s.toCharArray()) {
            if(vowels.contains(String.valueOf(c))) stack.push(c);
        }
        for (int i = 0; i < s.length(); i++) {
            if(vowels.contains(String.valueOf(s.charAt(i)))) sb.append(stack.pop());
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "aA";
        System.out.println(reverseVowels(s));
    }
}
