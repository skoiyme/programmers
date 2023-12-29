class Solution {
    public int solution(int[] numbers) {
         int max = 0;
	        int secondMax = 0;
	        int count = 0;
	        
	        for(int i=0; i<numbers.length; i++) {
	        	if(numbers[i] > max) {
	        		max=numbers[i];
	        	}
	        }
	        
	        for(int i=0; i<numbers.length; i++) {
	        	if(numbers[i] == max) {
	        		count++;
	        	}
	        }
	        
	        if(count > 1) {
	        	return max*max;
	        }
	        
	        for(int i=0; i<numbers.length; i++) {
	        	if(max > numbers[i] && numbers[i] > secondMax) {
	        		secondMax=numbers[i];
	        	}
	        }
	        return max*secondMax;
    }
}