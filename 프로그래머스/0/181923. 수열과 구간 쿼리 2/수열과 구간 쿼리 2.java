import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        List<Integer> list = new ArrayList<>();
        for(int[] query:queries){
            int min = -1;
            for(int i = query[0];i<=query[1];i++){
                if(arr[i] > query[2]){
                    if(min == -1){
                        min = arr[i];
                    }else{
                        if(min > arr[i]){
                            min = arr[i];
                        }
                    }
                }
            }
            list.add(min);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}