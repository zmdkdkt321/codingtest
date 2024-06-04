import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        if(topping.length == 1){
            return 0;
        }
        Set<Integer> havedType = new HashSet<>();
        Map<Integer,Integer> leftTypeCount = new HashMap<>();
        havedType.add(topping[0]);
        for(int i = 1; i < topping.length; i++){
            leftTypeCount.put(topping[i],leftTypeCount.getOrDefault(topping[i],0)+1);
        }
        // System.out.print(havedType.size());
        // System.out.print(":");
        // System.out.println(leftTypeCount.size());
        if(havedType.size() == leftTypeCount.size()){
            answer++;
        }
        
        int typeCount;
        for(int i = 1; i < topping.length-1; i++){
            leftTypeCount.put(topping[i],leftTypeCount.get(topping[i])-1);
            typeCount = leftTypeCount.get(topping[i]);
            // System.out.print(topping[i]);
            // System.out.print(":");
            // System.out.print(typeCount);
            // System.out.print("  ");
            if(typeCount == 0){
                leftTypeCount.remove(topping[i]);
            }
            havedType.add(topping[i]);
            // System.out.print(havedType.size());
            // System.out.print(":");
            // System.out.println(leftTypeCount.size());
            if(havedType.size() == leftTypeCount.size()){
                answer++;
            }
        }
        
        return answer;
    }
}