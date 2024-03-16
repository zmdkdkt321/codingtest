class Solution {
    boolean solution(String s) {
        int result = 0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        for(char c : s.toCharArray()){
            if(c == '(') result++;
            else if(c == ')') result--;
            if(result < 0) return false;
        }

        return result==0?true:false;
    }
}