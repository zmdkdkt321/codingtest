import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[][] stagesDif = new int[N][3];
        for(int i = 0; i < N; i++){
            stagesDif[i][0] = i+1;
        }
        for(int i:stages){
            if(i <= N) stagesDif[i-1][1]++;
            else i--;
            for(int j = 0; j < i; j++){
                stagesDif[j][2]++;
            }
        }
        
        Arrays.sort(stagesDif,new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                double aa = a[2]!=0?(double)a[1]/a[2]:0;
                double bb = b[2]!=0?(double)b[1]/b[2]:0;
                double compare = bb - aa;
                return compare<0?-1:compare==0?0:1;
            }
        });
        
        for(int i = 0; i < N;i++){
            answer[i] = stagesDif[i][0];
        }
        return answer;
    }
}