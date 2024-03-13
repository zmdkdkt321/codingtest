import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a,b,c,d};
        int equalCount = 0; // 6==a,a,a,a 2==a,a,b,b 1 == a,a,b,c 0 == a,b,c,d
        int pairNum = 0;
        for(int i = 0; i < 4; i++){
            for(int j = i+1; j < 4; j++){
                if(dice[i] == dice[j]){
                    equalCount++;
                    pairNum = dice[i];
                }
            }
        }
        
        switch(equalCount){
            case 6:
                return 1111*pairNum;
            case 3:
                int anotherNum = 0;
                for(int die:dice){
                    if(pairNum != die){
                        anotherNum = die;
                        break;
                    };
                }
                return (int)Math.pow(pairNum*10 + anotherNum,2);
            case 2:
                int anotherPairNum = 0;
                for(int die:dice){
                    if(pairNum != die){
                        anotherPairNum = die;
                        break;
                    };
                }
                return (anotherPairNum+pairNum)*Math.abs(anotherPairNum-pairNum);
            case 1:
                int q = 0;
                int r = 0;
                for(int die:dice){
                    if(pairNum != die){
                        if(q == 0) q = die;
                        else r = die;
                    }
                }
                return q*r;
            case 0:
                return Arrays.stream(dice).min().getAsInt();
        }
        return -1;
    }
}