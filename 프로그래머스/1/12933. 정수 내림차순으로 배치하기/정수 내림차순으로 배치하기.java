import java.util.*;
class Solution {
    public long solution(long n) {
 		int length = (int) (Math.log10(n) + 1);
		String temp = String.valueOf(n);
		long answer = 0;
		
		String[] num = temp.split("");
		Arrays.sort(num, Collections.reverseOrder());
		answer=Long.parseLong(String.join("", num));
		
		return answer;
    }
}