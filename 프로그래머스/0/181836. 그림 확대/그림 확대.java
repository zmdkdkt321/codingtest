class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int answerIndex = 0;
        StringBuilder sb = new StringBuilder();
        for(String str: picture){
            sb.setLength(0);
            for(char c:str.toCharArray()){
                for(int j = 0; j < k; j++) sb.append(c);
            }
            for(int j = 0; j < k; j++) answer[answerIndex++] = sb.toString();
        }
        return answer;
    }
}