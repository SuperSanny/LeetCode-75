//LeetCode: https://leetcode.com/problems/dota2-senate/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;
public class Dota2Senate {
    public static String predictPartyVictory(String senate) {
        StringBuilder sb = new StringBuilder(senate);
        int rCount = 0, dCount = 0;
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == 'R') rCount++;
            else dCount++;
        }
        int turn = 0;
        while(rCount > 0 && dCount > 0) {
            if(sb.charAt(turn) == 'R') {
                boolean bannedBefore = ban(sb, 'D', (turn+1) % sb.length());
                if(bannedBefore) turn--;
                dCount--;
            } else {
                boolean bannedBefore = ban(sb, 'R', (turn+1) % sb.length());
                if(bannedBefore) turn--;
                rCount--;
            }
            turn = (turn + 1) % sb.length();
        }
        if(rCount > 0) return "Radiant";
        else return "Dire";
    }
    public static boolean ban(StringBuilder sb, char toBan, int idx){
        boolean loopAround = false;
        int pointer = idx;
        while(true){
            if(pointer == 0) loopAround = true;
            if(sb.charAt(pointer) == toBan){
                sb.deleteCharAt(pointer);
                break;
            }
            pointer = (pointer + 1) % sb.length();
        }
        return loopAround;
    }
    public static void main(String[] args) {
        String senate = "RD";
        System.out.println(predictPartyVictory(senate));

    }
}
