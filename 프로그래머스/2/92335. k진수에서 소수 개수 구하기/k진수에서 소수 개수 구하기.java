import java.util.*;
class Solution {
    public boolean isPrime(Long n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i < (int)(Math.sqrt(n)+1); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public int solution(int n, int k) {
        int count = 0;
        String nstr = Integer.toString(n,k);
        System.out.println(nstr);
        for(String str : nstr.split("0")){
            if(!str.equals("") && isPrime(Long.parseLong(str))){
                count++;
            }
        }
        return count;
    }
}