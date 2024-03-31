import java.util.*;
class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
		int[] answer = {};
		String[] str = myString.split("x");

		System.out.println(Arrays.toString(str));

		for (int i = 0; i < str.length; i++) {
			list.add(str[i].length());

		}
		if (myString.charAt(myString.length() - 1) == 'x') {
			list.add(0);
		}
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
    }
}