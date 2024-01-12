class Solution {
    public int solution(int[] num, int n) {
        int answer = 0;
        for(int i=0; i<num.length; i++) {
    		if(n >= answer) {
    			answer+=num[i];
    		}
        }
        return answer;
    }
}