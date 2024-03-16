class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i=0; i<myString.length(); i++) {
        	if( myString.charAt(i) >= 66 && myString.charAt(i) <= 90 ) {
        		answer+=(char)(myString.charAt(i)+32);
        		continue;
        	 } 
        	if(myString.charAt(i) == 97) {
        		 answer+=(char)(myString.charAt(i)-32);
        		 continue;
        	 } 
        	
    		 answer+=myString.charAt(i);
        	 
        }
        
        return answer;
    }
}