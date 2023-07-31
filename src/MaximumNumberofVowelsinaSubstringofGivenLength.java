//LeetCode: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public static int maxVowels(String s, int k){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for(int i = 0; i < k; i++) {
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
        }
        int answer = count;
        for(int i = k; i<s.length(); i++) {
            count += vowels.contains(s.charAt(i)) ?  1 : 0;
            count -= vowels.contains(s.charAt(i-k)) ? 1 : 0;
            answer = Math.max(answer, count);
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "abciidfhg";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
}
