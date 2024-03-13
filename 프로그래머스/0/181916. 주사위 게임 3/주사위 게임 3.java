import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a,b,c,d};
        int equalCount = 0; // 6==a,a,a,a 2==a,a,b,b 1 == a,a,b,c 0 == a,b,c,d
        int pairNum = -1;
        int anotherNum = -1;
        for(int i = 0; i < 4; i++){
            for(int j = i+1; j < 4; j++){
                if(dice[i] == dice[j]){
                    equalCount++;
                    if(pairNum == -1)pairNum = dice[i];
                }
            }
            if(pairNum != dice[i]) anotherNum = dice[i];
        }
        
        switch(equalCount){
            case 6:
                return 1111*pairNum;
            case 3:
                return (int)Math.pow(pairNum*10 + anotherNum,2);
            case 2:
                return (anotherNum+pairNum)*Math.abs(anotherNum-pairNum);
            case 1:
                int q = 0;
                for(int die:dice){
                    if((pairNum != die) && (anotherNum !=die)) q = die;
                }
                return anotherNum*q;
            case 0:
                return Arrays.stream(dice).min().getAsInt();
        }
        return -1;
    }
}