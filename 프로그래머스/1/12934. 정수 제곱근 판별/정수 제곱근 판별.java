class Solution {
    public long solution(long n) {
       long answer = -1;
		long r = (long)Math.sqrt(n);
		long n2 = 0;
		if(r*r == n) {
			n2=r+1;
			answer=n2*n2;
		}
		return answer;	
    }
}