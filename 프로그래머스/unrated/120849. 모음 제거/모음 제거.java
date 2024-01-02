class Solution {
    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++) {
        	char ch = str.charAt(i);
        	if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
        		answer+=Character.toString(str.charAt(i));
        	}
        	
        }
        return answer;
    }
}