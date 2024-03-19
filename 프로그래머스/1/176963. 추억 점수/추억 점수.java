import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> yearningByName = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            yearningByName.put(name[i],yearning[i]);
        }
        int sum;
        for(int i = 0; i < photo.length; i++){
            sum = 0;
            for(int j = 0; j < photo[i].length; j++){
                sum+= yearningByName.get(photo[i][j])==null?0:yearningByName.get(photo[i][j]);
            }
            answer[i] = sum;
        }
        return answer;
    }
}