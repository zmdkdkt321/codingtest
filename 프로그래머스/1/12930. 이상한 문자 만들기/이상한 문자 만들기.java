class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] cArr = s.toUpperCase().toCharArray();
        boolean isOdd = true;
        for(char c : cArr){
            if(c == ' '){
                answer.append(' ');
                isOdd = true;
            }else if(isOdd){
                isOdd= !isOdd;
                answer.append(c);
            }else{
                isOdd= !isOdd;
                answer.append((char)(c + 32));
            }
        }
        return answer.toString();
    }
}