package level0;


public class 두수의합 {

	public static void main(String[] args) {
		
		두수의합 result = new 두수의합();
		int rere = result.solution2(3, 2);
		System.out.println(rere);
	
	}
		
	public int solution(int num1, int num2) {
		//boolean num = num1>=-50000 && num1<=50000 && num2>=-50000 && num2<=50000;
		int answer =0;
	        if(num1>=-50000 && num1<=50000 && num2>=-50000 && num2<=50000){
	            answer = num1+num2;
	    }
	        return answer;

	}
	
    public int solution2(int num1, int num2) {
    	double answer1 = num1/num2;
//        if(num1>0 && num1<=100 && num2>0 && num2<=100){
//        	
//        }
        return 0;
    }

}
