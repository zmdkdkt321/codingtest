import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++){
            sum = 0;
            sum += nums[i];
            for(int j=i+1; j < nums.length-1; j++){
                sum += nums[j];
                for(int k=j+1; k < nums.length; k++){
                    sum+=nums[k];
                    list.add(sum);
                    sum-=nums[k];
                }
                sum -= nums[j];
            }
        }
        boolean flag;
        for(int setNum:list){
            flag = true;
            for(int i = 2; i <= Math.sqrt(setNum); i++){
                if(setNum%i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }
        return answer;
    }
}