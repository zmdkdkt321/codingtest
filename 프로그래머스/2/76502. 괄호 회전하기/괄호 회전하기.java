import java.util.*;

class Solution {
    public boolean isOpen(char c){
        if(c == '(') return true;
        if(c == '{') return true;
        if(c == '[') return true;
        return false;
    }
    public boolean isMatch(char open,char close){
        if(open == '(' && close == ')') return true;
        if(open == '[' && close == ']') return true;
        if(open == '{' && close == '}') return true;
        return false;
    }
    
    public int solution(String s) {
        int openIndex = 0;
        int count = 0;
        int stackIndex = 0;
        char[] cArr = s.toCharArray();
        if(cArr.length % 2 == 1) return 0;
        
        char[] stack = new char[cArr.length];
        
        for(char c:cArr){
            if(isOpen(c)){
                stack[stackIndex++] = c;
            }else{
                if(stackIndex > 0 && isMatch(stack[stackIndex-1],c)){
                    stackIndex--;
                    if(stackIndex == openIndex){
                        count++;
                    };
                }else{
                    count = 0;
                    stack[stackIndex++] = c;
                    openIndex = stackIndex;
                }
            }
        }
        
        if(stackIndex == 0) return count;
        System.out.println(count);
        System.out.println(Arrays.toString(stack));
        System.out.println(stackIndex);
        int start = 0;
        int end = stackIndex-1;
        while(start < end){
            if(isMatch(stack[end],stack[start])){
                end--;
                start++;
            }else{
                return 0;
            }
        }
        
        return count+1;
    }
}