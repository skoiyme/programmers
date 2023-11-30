package level0;

public class 문자열0떼기 {

	public static void main(String[] args) {

		문자열0떼기 a = new 문자열0떼기();
		String aa = a.solution("0000000000000000000000000000000000000");
		System.out.println(aa);
	}

	public String solution(String n_str) {

		for (int i = 0; i < n_str.length(); i++) {
			if (!n_str.substring(i, i + 1).equals("0")) {
				return n_str.substring(i);
			}
		}
		return "히히 오류";
	}

}
