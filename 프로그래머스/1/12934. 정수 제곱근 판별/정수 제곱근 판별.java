class Solution {
    public long solution(long n) {
      long i = 1;
		while (i*i < n) {
			i++;
		}
		if(i*i == n) {
			return (i+1)*(i+1);
		}
		return -1;
    }
}