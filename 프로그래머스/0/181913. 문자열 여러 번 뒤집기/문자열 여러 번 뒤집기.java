import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] char_array = my_string.toCharArray();
        char temp;
        for(int[] query:queries){
            while(query[0] < query[1]){
                temp = char_array[query[0]];
                char_array[query[0]] = char_array[query[1]];
                char_array[query[1]] = temp;
                query[0]++;
                query[1]--;
            }
        }
        return new String(char_array);
    }
}