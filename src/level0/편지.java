package level0;

public class 편지 {

	public static void main(String[] args) {
		
		편지 let = new 편지();
		
		
		System.out.println(let.solution("김소예짱"));

	}
	
	
	public int solution(String message) {
		int answer = 0;
		for(int i=0; i<message.length(); i++) {
			answer = message.length()*2;
		}
        return answer;
    }

}
