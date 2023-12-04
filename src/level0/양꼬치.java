package level0;

public class 양꼬치 {

	public static void main(String[] args) {
		
		양꼬치 a = new 양꼬치();
		System.out.println(a.solution(64, 6)); 

	}
	
	
	public int solution(int n, int k) {
		int no = 12000*n;
		int ko = 2000*k;
		int koo = -2000;
		int answer = 0;
			if(no%10 == 0) {
	        	//answer = no+;
			} else {
				answer = no+ko;
			}
        return answer;
    }

}
