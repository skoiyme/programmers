class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++) {
        	if(myString.charAt(i) >= 97 && myString.charAt(i) <= 122) {
        		answer+=myString.charAt(i);
        	}
        	if(myString.charAt(i) >= 65 && myString.charAt(i) <= 90) {
        		answer+=Character.toString(myString.charAt(i)+32);
        	}
        	
        }
        return answer;
    }
}