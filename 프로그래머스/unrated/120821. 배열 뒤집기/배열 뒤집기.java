class Solution {
    public int[] solution(int[] num) {
    	int[] answer = new int[num.length]; 
    	
    	for(int i=0; i<num.length; i++) { 
    		answer[i] = num[num.length-i-1]; 
    	}
    	
        return answer;
    }
}