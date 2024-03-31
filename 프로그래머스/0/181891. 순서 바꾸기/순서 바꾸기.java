class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
		int num = num_list.length - n;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list.length == num) {
				num = 0;
			}
			if (i < n) {
				answer[num] = num_list[i];
			}

			answer[num] = num_list[i];
			num++;

		}

		return answer;
    }
}