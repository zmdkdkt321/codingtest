import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuffer result = new StringBuffer();
        
        for(char cOfa : a.toCharArray()){
            if(cOfa < 97){
                result.append(Character.toLowerCase(cOfa));
            }else{
                result.append(Character.toUpperCase(cOfa));
            }
        }
        
        System.out.print(result);
    }
}