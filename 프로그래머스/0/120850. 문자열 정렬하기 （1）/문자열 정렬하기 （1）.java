import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int num = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        
        
        for(int i=0; i<my_string.length(); i++) {
        	if( my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57 ) {
        		list.add(Character.getNumericValue(my_string.charAt(i)));
        	}
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        
        
        Arrays.sort(answer);
        return answer;
    }
}