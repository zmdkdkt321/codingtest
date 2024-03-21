import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] nArr = new int[number];
        for(int i = 1; i <= number; i++){
            for(int j = i; j <= number;j+=i){
                nArr[j-1]++;
            }
        }
        
        for(int i : nArr){
            answer += i>limit?power:i;
        }
        return answer;
    }
}