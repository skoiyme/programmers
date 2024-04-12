class Solution {
    public int[] solution(long n) {
       int length = (int)(Math.log10(n) + 1);
		String temp = String.valueOf(n);
        int[] answer = new int[length];
        for(int i=0; i<length; i++) {
        	answer[length-1-i] = Character.getNumericValue(temp.charAt(i));
        }
        return answer;
    }
}