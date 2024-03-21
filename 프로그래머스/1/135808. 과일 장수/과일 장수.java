class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] count = new int[k];
        
        for(int i:score){
            count[i-1]++;
        }
        
        int left = 0;
        for(int i = k; i > 0; i--){
            answer += (left + count[i-1])/m * m * i;
            left = (left + count[i-1])%m;
            
        }
        return answer;
    }
}