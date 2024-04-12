import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
		int temp = n;
		int length = (int) (Math.log10(n) + 1);
		int num = (int) Math.pow(10, length - 1);

		for (int i = 0; i < length; i++) {
			answer += temp / num;
			temp = temp % num;
			num /= 10;
		}
		return answer;
    }
}