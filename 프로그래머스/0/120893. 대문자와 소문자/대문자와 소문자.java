class Solution {
    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++){
        	
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
            	answer+=str.substring(i,i+1).toLowerCase();
            }
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                answer+=str.substring(i,i+1).toUpperCase();
            }
        }
       
        return answer;
    }
}