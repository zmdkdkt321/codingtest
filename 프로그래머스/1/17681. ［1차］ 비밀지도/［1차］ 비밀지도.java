class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        boolean[] map1 = new boolean[n];
        boolean[] map2 = new boolean[n];
        char[] cArr = new char[n];
        int temp1, temp2;
        
        for(int i = 0; i < n; i++){
            temp1 = arr1[i];
            temp2 = arr2[i];
            for(int j = n-1; j >= 0; j--){
                cArr[j]=(temp1%2==1 || temp2%2==1)?'#':' ';
                temp1/=2;
                temp2/=2;
            }
            answer[i] = new String(cArr);
        }
        return answer;
    }
}