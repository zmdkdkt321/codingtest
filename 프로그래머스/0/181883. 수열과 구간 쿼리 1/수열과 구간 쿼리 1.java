class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int[] query:queries){
            for(int i = query[0]; i <= query[1]; i++){
                arr[i]++;
            }
        }
        return arr;
    }
}