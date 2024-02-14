class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        if(arr1.length < arr2.length) {
        	return -1;
        }
        if(arr1.length > arr2.length) {
        	return 1;
        }
        for(int i=0; i<arr1.length; i++) {
        	num1+=arr1[i];
        	num2+=arr2[i];
        }
        
        if(num1 < num2) {
        	answer=-1;
        } 
        if(num1 > num2) {
        	answer=1;
        }
        		
        
        return answer;
    }
}