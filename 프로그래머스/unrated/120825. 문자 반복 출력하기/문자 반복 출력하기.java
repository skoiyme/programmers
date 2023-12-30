class Solution {
    public String solution(String str, int n) {
        String answer = "";
        
        for(int i=0; i<str.length(); i++) {
        	for(int j=0; j<n; j++) {
        		answer += str.substring(i, i+1);
        	}
        }
        
        
        
        return answer;
    }

}