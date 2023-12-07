package memo;

public class 연습장 {

	public static void main(String[] args) {

		연습장 a = new 연습장();
		System.out.println(a.solution3("sadfdsfd", "d"));
	}
	
	public String solution3(String my_string, String letter) {
        String answer = my_string;
        
        
        for(int i=0; i<my_string.length(); i++) {
        	
        	System.out.println(my_string.charAt(i) +", "+ letter.charAt(0));
        	
        	if(my_string.charAt(i) == letter.charAt(0)) {
        		//letter에 있는 한글자가 my_string을 처음부터 끝까지 쭉 실행했을때 letter안에 있는 글자가 == 될때
        		System.out.println("@@@@");
        		// 만약에 my string과 letter에 있는 한글자가 동일한게 있을때
        		answer = my_string.substring(0);
        		return "gege";
        	} 
        	
        }
        
        
        
        return answer;
    }

	public int solution2(String str1, String str2) {
		int answer =2;
		for (int i = 0; i <= str1.length()-str2.length(); i++) {
			
			System.out.println("i: " +i + ", " + str1.substring(i, str2.length()+i));
			
			if (str1.substring(i, str2.length()+i).equals(str2)) {
				return 1;
			} else {
				answer =2;
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
