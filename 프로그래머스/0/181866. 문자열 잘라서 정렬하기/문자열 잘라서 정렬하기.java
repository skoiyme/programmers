import java.util.*;
class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer = {}; 
        String[] tmp = {}; 
        
        tmp=myString.split("x");
        for(int i=0; i<tmp.length; i++) {
        	if(!tmp[i].equals("")) {
        		list.add(tmp[i]);
        	}
        }
        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}