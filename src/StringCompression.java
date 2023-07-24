//LeetCode: https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75

public class StringCompression {
    public static int compress(char[] chars) {
        int i = 0, count = 1;
        for (int j = 0; j < chars.length; j++) {
            if (j + 1 < chars.length && chars[j] == chars[j + 1]) {
                count++;
            } else {
                chars[i++] = chars[j];
                if (count > 1) {
                    String countString = String.valueOf(count);
                    for (char c : countString.toCharArray()) {
                        chars[i++] = c;
                    }
                }
                count = 1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
}
