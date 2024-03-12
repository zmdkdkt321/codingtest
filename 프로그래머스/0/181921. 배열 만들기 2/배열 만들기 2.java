class Solution {
    
    public int intTo5or0(int num){
        int result = 0;
        int digit = 1;
        for(int i = num; num > 0;num/=2){
            if(num%2 == 1){
                result += digit*5;
            }
            digit *=10;
        }
        return result;
    }
    
    //boolean로 표현된 비트를 5와 0으로만 구성된 숫자로 바꿔주는 함수
    public int bitToInt(boolean[] bit){
        int result = 0;
        for(int i = 0; i < bit.length;i++){
            if(bit[i]){
                result += Math.pow(2,i);
            }
        }
        return result;
    }
    
    public int[] solution(int l, int r) {
        int answer[] = {-1};
        boolean[] gThenL = new boolean[7];
        boolean[] lThenR = new boolean[7];
        
        //gThenL l 보다 크거나 같은 5와0으로만 이루어진 숫자 찾기
        //가장 큰 자리 수 부터 탐색
        for(int i = (int)Math.log10(l);i >= 0;i--){
            int lDigit = l/ (int)Math.pow(10,i) % 10;
            //해당 자리수가 5일 경우
            if(lDigit == 5) gThenL[i] = true;
            //해당 자리수가 0일 경우
            else if(lDigit == 0) gThenL[i] = false;
            //해당 자리수 < 5인 경우
            //해당 자리수에 5를 넣고 나머지 다 0으로 채우기
            else if(lDigit < 5){
                gThenL[i] = true;
                break;
            //해당 자리수 > 5인 경우
            //5가 아닌 자신보다 크고, 가장 가까운 자리수에 5를 넣고 뒤에 다 0으로 채우기
            }else{
                int j = i+1;
                while(gThenL[j] == true){
                    j++;
                }
                gThenL[j] = true;
                while(j > 0){
                    gThenL[--j] = false;
                }
                break;
            }
        }
        
        //gThenL R 보다 작거나 같은 5와0으로만 이루어진 숫자 찾기
        //가장 큰 자리 수 부터 탐색
        for(int i = (int)Math.log10(r);i >= 0;i--){
            //해당 자리수가 5일 경우
            int rDigit = r / (int)Math.pow(10,i) % 10;
            if(rDigit == 5) lThenR[i] = true;
            //해당 자리수가 0일 경우
            else if(rDigit == 0) lThenR[i] = false;
            //해당 자리수 < 5인 경우
            //해당 자리수에 5를 넣고 나머지 다 0으로 채우기
            else if(rDigit < 5){
                for(int j = i-1; j >= 0; j--){
                    lThenR[j] = true;
                }
                break;
            //해당 자리수 > 5인 경우
            //자신과 모든 밑의 자리수의 5 넣기
            }else{
                for(int j = i; j >= 0; j--){
                    lThenR[j] = true;
                }
                break;
            }
        }
        
        int gThenLInt = bitToInt(gThenL);
        int lThenRInt = bitToInt(lThenR);
        
        //만약 gThenL > lThenR 이라면 return {-1}
        if(gThenLInt > lThenRInt){
            return answer;
        }
        
        answer = new int[lThenRInt-gThenLInt+1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = intTo5or0(gThenLInt++);
        }
        
        return answer;
    }
}