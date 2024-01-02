class Solution {
    public int solution(String str) {
        int answer = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				answer+=Character.getNumericValue(str.charAt(i));
				
			}
		}
		

		return answer;
    }
}