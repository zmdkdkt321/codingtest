class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        int sum = 0;
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[0].length; j++){
                sum = 0;
                for(int k = 0; k < arr1[0].length; k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}