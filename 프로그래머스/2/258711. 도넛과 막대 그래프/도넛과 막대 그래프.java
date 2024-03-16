import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = {};
        Map<Integer,Integer> nodeCount = new HashMap<>();
        //들어오는게 없으며 2개 이상 가르키는 노드 = 생성 노드
        //생성 노드에서 뻗는 간선의 수 = 그래프의 수
        //받기만 하는 노드의 숫자 == 막대 그래프의 수
        //생성 노드를 제외하고 2개 보내는 친구는 8자 그래프
        //그래프의 숫자 - 막대 그래프의 수 - 8자 그래프의 수 = 도넛 그래프의 수
        
        //노드의 수를 구하기
        for(int[] edge:edges){
            if(nodeCount.get(edge[0]) == null){
                nodeCount.put(edge[0],0);
            }
            if(nodeCount.get(edge[1]) == null){
                nodeCount.put(edge[1],1);
            }else{
                nodeCount.put(edge[1],nodeCount.get(edge[1])+1);
            }
        }
        //노드의 수
        int nodeSize = nodeCount.size();
        //막대 그래프의 수는 쉽게 구함 = 주는게 없는 노드의 수
        //막대 그래프의 노드의 수도 쉽게 구함
        //도넛 그래프의 노드 수 + 8그래프의 노드의 수= z
        //nodeSize - 주는게 없는 노드의 수 -1
        //노드의 수 = 
        //간선의 수 = x(z)+y()+(x+y)
        //x = 도넛 그래프 수, y = 8그래프 수
        
        //생성 노드 무저저저적권 필요하다
        
        //
        int graghCount = 0;
        //해당 인덱스에서 출발하는 간선의 수
        int startEdge[] = new int[nodeSize+5];
        //해당 인덱스에 도착하는 간선의 수
        int endEdge[] = new int[nodeSize+5];
        
        for(int[] edge:edges){
            startEdge[edge[0]]++;
            endEdge[edge[1]]++;
        }
        
        int createdNode = -1;
        int stickGraphCount = 0;
        int eigthGraphCount = 0;
        for(int i = 1; i <= nodeSize; i++){
            if(endEdge[i] == 0){
                if(startEdge[i] >= 2) createdNode = i;
            }else if(startEdge[i] == 2) eigthGraphCount++;
            else if(startEdge[i] == 0) stickGraphCount++;
        }
        int donutGraphCount = startEdge[createdNode]-stickGraphCount-eigthGraphCount;
        
        int result[] = {createdNode,donutGraphCount,stickGraphCount,eigthGraphCount};
        return result;
    }
}