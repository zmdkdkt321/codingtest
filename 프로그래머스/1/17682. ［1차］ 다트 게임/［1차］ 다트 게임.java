class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] nums = new int[3];
        int numsIndex = 0;
        char[] dartRCArr = dartResult.toCharArray();
        
        for(int i = 0; i < dartRCArr.length;){
            if(dartRCArr[i] == '1' && dartRCArr[i+1] == '0'){
                nums[numsIndex] = 10;
                i+=2;
            }else if(dartRCArr[i]>='0'&& dartRCArr[i]<='9'){
                nums[numsIndex] = dartRCArr[i] - '0';
                i++;
            }
            if(dartRCArr[i] == 'D') nums[numsIndex] *= nums[numsIndex];
            if(dartRCArr[i] == 'T') nums[numsIndex] *= nums[numsIndex]*nums[numsIndex];
            i++;
            if(i >= dartRCArr.length){
                break;
            }
            if(dartRCArr[i] == '*'){
                if(numsIndex > 0){
                    nums[numsIndex-1]*=2;
                }
                nums[numsIndex]*=2;
                i++;
            }else if(dartRCArr[i] == '#'){
                nums[numsIndex]*=-1;
                i++;
            }
            numsIndex++;
        }
        for(int num:nums){
            answer+=num;
        }
        return answer;
    }
}