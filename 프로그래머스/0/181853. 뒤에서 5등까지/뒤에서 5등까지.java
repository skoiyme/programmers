import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
       Arrays.sort(num_list);
       for(int i=0; i<num_list.length; i++) {
    	   if(i < 5 ) {
    		   answer[i]=num_list[i];
    	   }
       }
        return answer;
    }
}