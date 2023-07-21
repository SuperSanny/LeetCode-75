//LeetCode: https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class ReverseWordsinaString {
    public static String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--) {
            reversed.append(words[i]);
            if(i>0) reversed.append(" ");
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
