//LeetCode: https://leetcode.com/problems/decode-string/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<StringBuilder> stack1 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            } else if(c == '['){
                stack.push(num);
                stack1.push(sb);
                num = 0;
                sb = new StringBuilder();
            } else if(c == ']'){
                int repeat = stack.pop();
                StringBuilder temp = sb;
                sb = stack1.pop();
                for (int i = 0; i < repeat; i++) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
