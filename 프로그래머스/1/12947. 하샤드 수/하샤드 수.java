class Solution {
    public boolean solution(int x) {
        int sum = 0;
        for(char a :Integer.toString(x).toCharArray()){
            sum += a-'0';
        }
        return x%sum==0?true:false;
    }
}