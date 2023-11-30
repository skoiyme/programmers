package level0;

public class 아메리카노 {

	public static void main(String[] args) {
		
		아메리카노 aa = new 아메리카노();
//		for(int i : aa.solution(30000)) {
//			System.out.println(aa.solution()); 
//		}
		
		for(int i=0; i<aa.solution(30000).length; i++) {
			System.out.println(aa.solution(30000)[i]); 
		}
		

	}
	
	public int[] solution(int money) {
		// 아메리카노 5500원.. 머쓱이가 갖고있는 돈은 ???랜덤
		// 아메리카노 몇잔 마셨는지 > 만원 : 5500-1잔 , 잔돈4500원
		// -> money-5500 * aa = 잔돈
		int aa = money / 5500; // 몇잔
		//int bb = money-5500 * aa; // 잔돈
		int bb = money%5500; //잔돈
		
        int[] answer = {aa,bb};
        return answer;
    }

}
