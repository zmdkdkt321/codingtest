class Solution {
    public int[] solution(String[] wallpaper) {
        int left =0,right=0,top=0,bottom = 0;
        char[][] cArr = new char[wallpaper.length][wallpaper[0].length()];
        for(int i = 0; i < wallpaper.length; i++){
            cArr[i] = wallpaper[i].toCharArray();
        }
        outer:
        for(int i = 0; i < cArr.length; i++){
            for(char c: cArr[i]){
                if(c == '#'){
                    top = i;
                    break outer;
                }
            }
        }
        outer:
        for(int i = cArr.length-1; i >= 0; i--){
            for(char c: cArr[i]){
                if(c == '#'){
                    bottom = i+1;
                    break outer;
                }
            }
        }
        outer:
        for(int i = 0; i < cArr[0].length; i++){
            for(int j = 0; j < cArr.length; j++){
                if(cArr[j][i] == '#'){
                    left = i;
                    break outer;
                }
            }
        }
        outer:
        for(int i = cArr[0].length-1; i >= 0; i--){
            for(int j = 0; j < cArr.length; j++){
                if(cArr[j][i] == '#'){
                    right = i+1;
                    break outer;
                }
            }
        }
        
        int[] answer = {top,left,bottom,right};
        return answer;
    }
}