class Solution {
    public String solution(int a, int b) {
        int daysByMonth[] = {0,31,60,91,121,152,182,213,244,274,305,335};
        String days[] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        return days[(daysByMonth[a-1]+b)%7];
    }
}