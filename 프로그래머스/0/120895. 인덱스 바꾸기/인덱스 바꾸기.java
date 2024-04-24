class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
        	if(i == num1) {
        		answer+=my_string.substring(num2, num2+1);
        		continue;
        	}
        	if(i == num2) {
        		answer+=my_string.substring(num1, num1+1);
        		continue;
        	}
        	answer+=my_string.substring(i,i+1);
        }
        return answer;
    }
}