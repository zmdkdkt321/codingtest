import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int releaseSum[] = new int[progresses.length];
        int dayCount = 0;
        int pIndex = 0;
        
        while(pIndex < progresses.length){
            if(progresses[pIndex] >= 100){
                while(pIndex < progresses.length && progresses[pIndex] >= 100){
                    releaseSum[dayCount]++;
                    pIndex++;
                }
                dayCount++;
            }
            
            for(int i = 0; i < progresses.length; i++){
                progresses[i]+=speeds[i];
            }
        }
        
        
        int[] answer = new int[dayCount];
        
        return Arrays.copyOfRange(releaseSum,0,dayCount);
    }
}