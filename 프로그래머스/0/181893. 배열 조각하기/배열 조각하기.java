import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        int startIndex = 0;
        int endIndex = arr.length-1;
        for(int i = 0; i < query.length; i++){
            if(i%2 == 0){
                endIndex = startIndex + query[i];
            }else{
                startIndex += query[i];
            }
        }
        
        return Arrays.copyOfRange(arr,startIndex,endIndex+1);
    }
}