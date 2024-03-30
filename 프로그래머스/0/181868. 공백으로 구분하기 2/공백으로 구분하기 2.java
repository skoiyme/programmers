import java.util.*;
class Solution {
    public String[] solution(String my_string) {
		List<String> list = new ArrayList<>();
        String[] answer = {};
        String[] str = my_string.split(" ");
        
        for(int i=0; i<str.length; i++) {
        	if(!str[i] .equals("")) {
        		list.add(str[i]);
        	}
        }
        
        answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        
        return answer;
    }
}