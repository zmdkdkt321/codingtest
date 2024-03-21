class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] nArr = new boolean[n+1];
        for(int i = 2; i <= n; i++){
            if(!nArr[i]){
                for(int j = i*2; j <= n; j+=i){
                    nArr[j] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(!nArr[i]) answer++;
        }
        return answer;
    }
}