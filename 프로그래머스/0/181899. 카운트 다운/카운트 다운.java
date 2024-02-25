import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        Integer[] integerArr = new Integer[start_num-end_num+1];
        int num = 0;
        
        for(int i=end_num; i<=start_num; i++) {
        	answer[num]=i;
        	num++;
        }
        
        for(int i=0; i<answer.length; i++) {
        	integerArr[i]=answer[i];
        }
        Arrays.sort(integerArr, Collections.reverseOrder());
        
        for(int i=0; i<answer.length; i++) {
        	answer[i]=integerArr[i];
        }
        
        return answer;
    }
}