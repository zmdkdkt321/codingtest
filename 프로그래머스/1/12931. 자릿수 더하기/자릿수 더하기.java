import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = (int)Math.log10(n);i >= 0;i--){
            answer+=n/Math.pow(10,i) % 10;
        }

        return answer;
    }
}