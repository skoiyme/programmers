import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<String>();
		
        String[] answer = {};
        
        for(int i=0; i<names.length; i+=5) {
        		list.add(names[i]);
        }
        
        answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
      
        return answer;
    }
}