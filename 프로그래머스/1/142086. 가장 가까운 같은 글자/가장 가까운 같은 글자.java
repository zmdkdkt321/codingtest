import java.util.*;

class Solution {
    public int[] solution(String s) {
        char[] cArr = s.toCharArray();
        int[] answer = new int[cArr.length];
        Integer index;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < cArr.length; i++){
            index = map.get(cArr[i]);
            map.put(cArr[i],i);
            answer[i] = (index==null)?-1:i-index;
        }
        return answer;
    }
}