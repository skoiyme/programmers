import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = new String[my_string.length()];
        my_string=my_string.toLowerCase();
        str=my_string.split("");
        Arrays.sort(str);
        answer=String.join("", str);
        return answer;
    }
}