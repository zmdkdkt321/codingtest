class Solution {
    public long solution(long n) {
        //7071068 ^ 2 = 50,000,002,660,624
        //7071067 ^ 2 = 49,999,988,518,489
        long low = 1, high = 7071067;
        long mid = (low+high)/2;
        long midPow;
        while(low<high){
            midPow = mid*mid;
            if(midPow == n){
                return (mid+1)*(mid+1);
            }else if(midPow > n){
                high = mid-1;
                mid = (high+low)/2;
            }else{
                low = mid+1;
                mid = (high+low)/2;
            }
        }
        if(mid*mid==n) return (mid+1)*(mid+1);
        return -1;
    }
}