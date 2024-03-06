class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals("<")){
            if(n < m){
                return 1;
            }
        }else{
            if(n > m){
                return 1;
            }
        }
        if(eq.equals("=")){
            return n==m?1:0;
        }
        return 0;
    }
}