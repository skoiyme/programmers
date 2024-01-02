class Solution {
    public int[] solution(int n) {
        int leng = (n%2 == 0) ? n/2:n/2+1 ;
        int[] answer = new int[leng];

		int j = 0;
		for (int i = 1; i <= n; i+=2) {
				answer[j++] = i;
		}

		return answer;
    }
}