class Solution {
    public int solution(int a, int b, int n) {
        if(n < a) return 0;
        return n/a*b + solution(a,b,n/a*b + n%a);
    }
}