class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < myString.length(); i++) {
			sb.append(myString.charAt(i) == 'A' ? "B" : "A");
		}
		answer = sb.toString().contains(pat) ? 1 : 0;
		return answer;
    }
}