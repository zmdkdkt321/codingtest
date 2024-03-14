class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==32){
                answer.append(c);
                continue;
            }
            if(c < 97){
                c = (char)(int)(((c - 65 + n) % 26) + 65);
            }else{
                c = (char)(int)(((c - 97 + n) % 26) + 97);
            }
            answer.append(c);
        }
        return answer.toString();
    }
}