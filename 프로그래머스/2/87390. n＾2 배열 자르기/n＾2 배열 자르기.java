class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        int answerIndex = 0;
        int col = (int)(left/n);
        int row = (int)(left%n);
        for(int i = 0; i < answer.length; i++){
            if(row < col+1) answer[i] = col+1;
            else answer[i] = row+1;
            if(++row == n){
                row = 0;
                col++;
            }
        }
        
        return answer;
    }
}