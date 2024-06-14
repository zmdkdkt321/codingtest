import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int orderIndex = 0;
        Stack<Integer> assistantRail = new Stack<>();
        
        for(int box = 1; box <= order.length; box++){
            if(box == order[orderIndex]){
                answer++;
                orderIndex++;
                while(!assistantRail.empty() && assistantRail.peek() == order[orderIndex]){
                    assistantRail.pop();
                    answer++;
                    orderIndex++;
                }
            }else{
                assistantRail.add(box);
            }
        }
        
        
        
        return answer;
    }
}