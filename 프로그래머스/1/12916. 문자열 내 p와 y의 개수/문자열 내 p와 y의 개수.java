class Solution {
    boolean solution(String s) {
        int count=0;
        for(char a: s.toUpperCase().toCharArray()){
            if(a == 'P') count++;
            else if(a == 'Y') count--;
        }
        return count==0;
    }
}