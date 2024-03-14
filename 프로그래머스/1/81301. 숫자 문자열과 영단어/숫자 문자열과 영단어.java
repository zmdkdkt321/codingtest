class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        char temp;
        for(int index = 0; index < s.length();){
            temp = s.charAt(index);
            if(temp == 'z'){
                sb.append("0");
                index+=4;
            }else if(temp == 'o'){
                sb.append("1");
                index+=3;
            }else if(temp == 't'){
                if(s.charAt(index+1) == 'w'){
                    sb.append("2");
                    index+=3;
                }else{
                    sb.append("3");
                    index+=5;
                }
            }else if(temp == 'f'){
                if(s.charAt(index+1) == 'o'){
                    sb.append("4");
                    index+=4;
                }else{
                    sb.append("5");
                    index+=4;
                }
            }else if(temp == 's'){
                if(s.charAt(index+1) == 'i'){
                    sb.append("6");
                    index+=3;
                }else{
                    sb.append("7");
                    index+=5;
                }
            }else if(temp == 'e'){
                sb.append("8");
                index+=5;
            }else if(temp == 'n'){
                sb.append("9");
                index+=4;
            }else{
                sb.append(temp);
                index+=1;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}