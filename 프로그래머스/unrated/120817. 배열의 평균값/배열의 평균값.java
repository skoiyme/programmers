class Solution {
    
    public double solution(int[] numbers) {

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			int a = numbers[i];
			sum = a + sum;
		}
		return sum / (double) numbers.length;

	}
   
}