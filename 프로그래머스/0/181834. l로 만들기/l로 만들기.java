class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++) {
        	if(myString.charAt(i) >= 97 && myString.charAt(i) <= 107) {
        		answer+="l";
        	} else {
        		answer+=myString.substring(i,i+1);
        	}
        }
        return answer;
    }
}