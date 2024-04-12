class Solution {
    boolean solution(String s) {
        int p = 0;
		int y = 0;
		for(int i=0; i<s.length(); i++) {
			p += (s.substring(i,i+1).equals("p") || s.substring(i,i+1).equals("P")) ? 1:0;
			y += (s.substring(i,i+1).equals("y") || s.substring(i,i+1).equals("Y")) ? 1:0;
			}
		return (p == y) ? true : false;
    }
}