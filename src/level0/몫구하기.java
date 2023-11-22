package level0;

public class 몫구하기 {

	public static void main(String[] args) {
		System.out.println(solution(10,5));
	}
	
    static int solution(int num1, int num2) {
        if(num1 > 0 && num1 <=100){
            if(num2 > 0 && num2 <=100)
                return num1/num2;
        }
        return 0;
    }
}
