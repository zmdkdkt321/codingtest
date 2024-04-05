import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int count = 1;
        Set<String> sHS = new HashSet<>();
        sHS.add(words[0]);
        char beforeLastWord = words[0].charAt(words[0].length()-1);
        for(int i = 1; i < words.length; i++){
            if(sHS.contains(words[i])) break;
            sHS.add(words[i]);
            
            if(beforeLastWord != words[i].charAt(0)) break;
            beforeLastWord = words[i].charAt(words[i].length()-1);
            
            count++;
        }
        if(count == words.length){
            int[] answer = {0,0};
            return answer;
        }
        int[] answer = {(count)%n +1,(count)/n +1};
        System.out.print(count);
        return answer;
    }
}