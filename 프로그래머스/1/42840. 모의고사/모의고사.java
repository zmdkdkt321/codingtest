import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int count1 = 0,count2 = 0,count3 = 0;
        int[] supo2Pattern = {2,1,2,3,2,4,2,5};
        int[] supo3Pattern = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == i%5+1) count1++;
            if(answers[i] == supo2Pattern[i%8]) count2++;
            if(answers[i] == supo3Pattern[i%10]) count3++;
        }
        int[] result = new int[3];
        result[0] = count1;
        result[1] = count2;
        result[2] = count3;
        
        System.out.print(Arrays.toString(result));
        System.out.print(count1);
        
        int max = 0;
        int maxCount = 0;
        for(int i:result){
            if(max < i){
                max = i;
                maxCount = 1;
            }else if(max == i) maxCount++;
        }
        
        int[] winners = new int[maxCount];
        int winnersIndex = 0;
        for(int i = 0; i < result.length;i++){
            if(result[i] == max) winners[winnersIndex++] = i+1;
        }
        
        return winners;
    }
}