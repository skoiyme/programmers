

class Solution {
    public String solution(String my_string, String letter) {
String answer = "";
int leng = my_string.length();

        for(int i=0; i<leng; i++){
            if(!(my_string.charAt(i) == letter.charAt(0))){
           answer=   answer+(my_string.substring(i,i+1));
                

        } else {

}
        }
        return answer;
    
}
}