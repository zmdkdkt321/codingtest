class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < food.length; i++){
            for(int j = 0; j<food[i]/2;j++) sb.append(i);
        }
        StringBuilder sbOrigin = new StringBuilder(sb);
        return sbOrigin.append(0).append(sb.reverse()).toString();
    }
}