import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int answerIndex = 0;
        Set<Integer> intSet = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(!intSet.contains(arr[i])){
                answer[answerIndex++] = arr[i];
                intSet.add(arr[i]);
                if(answerIndex == k){
                    break;
                }
            }
        }
        if(answerIndex != k){
            for(int i = answerIndex; i < k; i++){
                answer[answerIndex++] = -1;
            }
        }
        
        return answer;
    }
}