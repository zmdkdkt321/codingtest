class Solution {
    int[][] oilLand;
    //x좌표가 가지는 오일의 양
    int oilAmounts[];
    
    //오일 영역의 양
    int oliAmount = 0;
    //오일 영역이 x 범위
    boolean oilBoundary[];
    //탐색을 완료한 영역
    boolean chackedLand[][];
    
    public int solution(int[][] land) {
        if(land.length == 0){
            return 0;
        }
        oilLand = land;
        oilAmounts = new int[land[0].length];
        chackedLand = new boolean[land.length][land[0].length];
        
        for(int x = 0; x < land.length; x++){
            for(int y = 0; y < land[0].length; y++){
                //땅이 아직 탐색되지 않았고 기름이 있으면 탐색 시작
                if(oilLand[x][y] == 1 && !chackedLand[x][y]){
                    oliAmount = 0;
                    oilBoundary = new boolean[land[0].length];
                    //재귀 탐색
                    recursionSearch(x, y);
                    //영역에 걸쳐진 x에 오일 양 추가
                    for(int i = 0; i < oilBoundary.length; i++){
                        if(oilBoundary[i]){
                            oilAmounts[i] += oliAmount;
                        }
                    }
                }
            }
        }
        int maxOilAmount = 0;
        for (int i = 0; i < oilAmounts.length; i++) {
			if (oilAmounts[i] > maxOilAmount) {
				maxOilAmount = oilAmounts[i];
			}
		}
        return maxOilAmount;
    }
    
    public void recursionSearch(int x,int y) {
        //해당 좌표에 기름이 있고 탐색하지 않았다면
        if(oilLand[x][y] == 1 && !chackedLand[x][y]){
            oliAmount++;
            oilBoundary[y] = true;
            chackedLand[x][y] = true;
            
            if(x < chackedLand.length-1) {
            	recursionSearch(x+1,y);
            }
            if(x > 0) {
            	recursionSearch(x-1,y);
            }
            if(y < chackedLand[0].length-1) {
            	recursionSearch(x,y+1);
            }
            if(y > 0) {
            	recursionSearch(x,y-1);
            }
        }
    }
}
