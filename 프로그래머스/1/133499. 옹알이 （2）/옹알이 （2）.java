class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        char[] cArr;
        char lastWord;
        int i;
        for(String str: babbling){
            str = str.replaceAll("aya","1");
            str = str.replaceAll("ye","2");
            str = str.replaceAll("woo","3");
            str = str.replaceAll("ma","4");
            cArr = str.toCharArray();
            lastWord = 0;
            for(i = 0; i < cArr.length;i++){
                if(lastWord == cArr[i]) break;
                if(cArr[i] != '1'&&cArr[i] != '2'&&cArr[i] != '3'&&cArr[i] != '4') break;
                lastWord = cArr[i];
            }
            if(i == cArr.length) answer++;
        }
        return answer;
    }
}