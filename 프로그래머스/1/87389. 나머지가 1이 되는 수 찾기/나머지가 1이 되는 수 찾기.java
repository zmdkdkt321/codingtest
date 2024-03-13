class Solution {
    public int solution(int n) {
        for(int i = 1; 1 < n;i++){
            if(n%i==1)return i;
        }
        return 0;
    }
}