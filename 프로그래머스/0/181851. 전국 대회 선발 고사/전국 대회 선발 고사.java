import java.util.*;

class Solution {
    public int indexOf(int[] rank, int item){
        for(int i = 0; i < rank.length; i++){
            if(rank[i] == item) return i;
        }
        return -1;
    }
    
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> attendacePlayer = new ArrayList<Integer>();
        for(int i = 0; i < attendance.length; i++){
            if(attendance[i]) attendacePlayer.add(rank[i]);
        }
        Collections.sort(attendacePlayer);
        
        return indexOf(rank,attendacePlayer.get(0))*10000 + indexOf(rank,attendacePlayer.get(1))*100 + indexOf(rank,attendacePlayer.get(2));
    }
}