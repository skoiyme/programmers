class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int begin = my_string.length()-is_suffix.length();
        
        if(begin < 0){
            return 0;
        }
        
        if(is_suffix.equals(my_string.substring(begin))) {
        	answer = 1;
        }
        return answer;
         
    }
}