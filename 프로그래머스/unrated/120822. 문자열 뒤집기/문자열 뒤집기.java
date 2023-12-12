class Solution {
    public String solution(String str) {
		String answer = "";
		for(int i=0; i<str.length(); i++) {
			answer = answer+str.charAt(str.length()-i-1);
		}
        return answer;
    }
}