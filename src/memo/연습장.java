package memo;


public class 연습장 {

	public static void main(String[] args) {
		
		연습장 a = new 연습장();
		int[] answer = {0,1,2,3};
			System.out.println(a.solution4(answer));
		
	}
	
    public int[] solution4(int[] num) {
    	int[] answer = new int[num.length];
    	for(int i=0; i<num.length; i++) {
    		answer[i] = num[num.length-i-1];
    		System.out.println(answer[i]);
    	}
        return answer;
    }

	public String solution3(String my_string, String letter) {
		String answer = "";
		int leng = my_string.length();

		for (int i = 0; i < leng; i++) {
			if (my_string.charAt(i) != letter.charAt(0)) {
				answer = answer.concat(i+my_string.substring(i, i + 1)+",");
			}
		}
		return answer;

	}

	public int solution2(String str1, String str2) {
		int answer = 2;
		for (int i = 0; i <= str1.length() - str2.length(); i++) {

			System.out.println("i: " + i + ", " + str1.substring(i, str2.length() + i));

			if (str1.substring(i, str2.length() + i).equals(str2)) {
				return 1;
			} else {
				answer = 2;
			}
		}
		return answer;
	}

	// 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
	// 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를
	// 먹었다면 총얼마를 지불해야 하는지
	// return 하도록 solution 함수를 완성해보세요.

	public int solution(int n, int k) {
//		int nn = 0;
//		// n이 나머지0이 될때 k를 -2000원으로 하나씩 증가
////		for(int i=0; i<n/10; i++) {
////			k -= 1;
////		}
//		
//		k = k - (n/10);
//		
//		nn = 12000*n+k*2000;
//		
		return 0;

	}

}
