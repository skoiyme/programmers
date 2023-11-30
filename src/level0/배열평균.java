package level0;

public class 배열평균 {

	public static void main(String[] args) {

		int[] qq = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		배열평균 aa = new 배열평균();

		System.out.println(aa.solution(qq) + "dddd");

	}

	public double solution(int[] numbers) {

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			int a = numbers[i];
			sum = a + sum;
			// sum +=a;
		}
		return sum / (double) numbers.length;

	}

}
