import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Integer index;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            index = map.get(s.charAt(i));
            answer[i] = (map.get(s.charAt(i))==null)?-1:i-index;
            map.put(s.charAt(i),i);
        }
        return answer;
    }
}