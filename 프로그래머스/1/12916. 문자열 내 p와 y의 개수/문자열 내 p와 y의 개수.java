class Solution {
    boolean solution(String s) {
        int pCount=0, yCount=0;
        for(char a: s.toCharArray()){
            switch(a){
                case 'p':
                case 'P':
                    pCount++;
                    break;
                case 'y':
                case 'Y':
                    yCount++;
                    break;
            }
        }

        return pCount==yCount?true:false;
    }
}