import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        int jCount = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i:arr){
            while(i > 1){
                for(int j = 2; j < 97;j++){
                    jCount = 0;
                    while(i > 0 && i%j==0){
                        i/=j;
                        jCount++;
                        if(hash.getOrDefault(j,0) < jCount) hash.put(j,jCount);
                    }
                }
            }
        }
        for(Integer i:hash.keySet()){
            System.out.print(i + ":");
            
            System.out.println(hash.get(i));
            for(int j = 0; j < hash.get(i); j++){
                answer *= i;
            }
        }
        return answer;
    }
}