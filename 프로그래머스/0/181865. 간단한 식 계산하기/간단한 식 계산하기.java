class Solution {
    public int solution(String binomial) {
        int answer = 0;
		int num = 0;
		for (int i = 0; i < binomial.length(); i++) {
			if (binomial.charAt(i) == '+') {
				num = binomial.indexOf("+");
				int n1 = Integer.parseInt(binomial.substring(0, num - 1));
				int n2 = Integer.parseInt(binomial.substring(num + 2));
				answer = n1 + n2;
			}
			if (binomial.charAt(i) == '-') {
				num = binomial.indexOf("-");
				int n1 = Integer.parseInt(binomial.substring(0, num - 1));
				int n2 = Integer.parseInt(binomial.substring(num + 2));
				answer = n1 - n2;
			}
			if (binomial.charAt(i) == '*') {
				num = binomial.indexOf("*");
				int n1 = Integer.parseInt(binomial.substring(0, num - 1));
				int n2 = Integer.parseInt(binomial.substring(num + 2));
				answer = n1 * n2;
			}
		}
		return answer;
    }
}