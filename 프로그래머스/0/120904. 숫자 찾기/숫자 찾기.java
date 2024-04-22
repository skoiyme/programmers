class Solution {
    public int solution(int num, int k) {
        int answer = -1;
		int length = (int) (Math.log10(num) + 1);
		String strN = Integer.toString(num);
		String strK = Integer.toString(k);
		for(int i=0; i<length; i++) {
			if(strN.substring(i,i+1).equals(strK)) {
				answer=i+1;
                break;
			}
		}
		return answer;
    }
}