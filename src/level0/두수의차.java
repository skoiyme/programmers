package level0;

public class 두수의차 {

	public static void main(String[] args) {
		두수의차 result = new 두수의차();
		int re = result.solution(2, 3);
		System.out.println(re);
		
		int result2 = result.solution2(3, 2);
		System.out.println(result2);
		
	}
	
	
	    public int solution(int num1, int num2) {
	    	boolean result = -50000<=num1 && 50000>=num1 && -50000<=num2 && 50000>=num2;
	    	int re = 0;
	    	if(result) {
	    		re = num1-num2;
	    		return re;
	    	}
	    	return 0;
	    }
	    
	    
	        public int solution2(int num1, int num2) {
	        	int answer =0;
	            if(num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
	            	answer = num1%num2;
	            }
	            return answer;
	        }
	    }


