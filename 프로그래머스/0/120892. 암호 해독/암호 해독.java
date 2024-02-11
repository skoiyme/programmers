class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length(); i+=code) {
        	answer=answer.concat(cipher.substring(i, i+1));
        }
       
        return answer;
    }
}