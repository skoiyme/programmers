package level0;

public class 각도 {

	public static void main(String[] args) {
		
		각도 a = new 각도();
		 int aa = a.solution2(7);
		 System.out.println(aa);

	}

	public int solution(int angle) {
		int answer = 0;
	
		if (angle < 90) {
			answer = 1;
		} else if (angle == 90) {
			answer = 2;
		} else if (angle < 180) {
			answer = 3;
		} else {
			answer = 4;
		}
		
		return answer;
	}
	
	
	public int solution2(int n) {
        int answer = 0;
        for(int i=0; i<=n; i+=2) {
        	answer += i;
        }
        return answer;
    }
	
	public int solution3(int n) {
        int answer = 0;
        int i = 0;
        while(i<=n ) {
        	answer += i;
        	i+=2;
        }
        return answer;
    }

}
