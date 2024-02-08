class Solution {
    public int solution(String myString, String pat) {
        myString=myString.toUpperCase();
        pat=pat.toUpperCase();
        
        int answer = pat.equals(myString)? 1:0;
        
        if(myString.length() < pat.length()) {
        	return 0;
        }
        
        for(int i=0; i<myString.length()-pat.length(); i++) {
        	if(pat.equals(myString.substring(i, pat.length()+i))) {
        		answer=1;
        	}
        }
        
        return answer;
    }
}