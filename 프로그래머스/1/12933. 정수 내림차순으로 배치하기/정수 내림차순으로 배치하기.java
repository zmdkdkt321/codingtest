import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] cArr = str.toCharArray();
        Arrays.sort(cArr);
        StringBuilder sb = new StringBuilder(new String(cArr));
        return Long.parseLong(sb.reverse().toString());
    }
}