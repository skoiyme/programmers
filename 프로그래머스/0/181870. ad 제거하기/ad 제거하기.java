import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
		String[] answer = {};
		for (int i = 0; i < strArr.length; i++) {
			if(!strArr[i].contains("ad")) {
				list.add(strArr[i]);
			}
		}
		answer = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i]=list.get(i);
		}
		return answer;
    }
}