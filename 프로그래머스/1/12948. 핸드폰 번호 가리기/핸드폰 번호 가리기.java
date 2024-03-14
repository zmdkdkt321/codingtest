import java.util.*;

class Solution {
    public String solution(String phone_number) {
        char[] answer = new char[phone_number.length()];
        Arrays.fill(answer,'*');
        for(int i = phone_number.length()-4; i < phone_number.length(); i++){
            answer[i] = phone_number.charAt(i);
        }
        return new String(answer);
    }
}