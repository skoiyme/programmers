package level0;

public class 숫자비교 {

	public static void main(String[] args) {
		숫자비교 a = new 숫자비교();
		
		int result = a.solution(-1, -1);
		
		System.out.println(result);
	}

	public int solution(int num1, int num2) {
		boolean a = (num1 >= 0 && num1 <= 10000);
		if (num1 == num2 && a) {
			return 1;
		} else {
			return -1;
		}
	}

}
