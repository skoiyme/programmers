class Solution {
    public String[] solution(String str) {
        String[] answer = {};
        String[] temp = str.trim().split(" ");
        int cnt = 0;
        int j = 0;

        for(int i=0; i< temp.length; i++){
            if(!temp[i].equals("")){
                cnt++;
            }
        }
        
        answer = new String[cnt];
        
        for(int i=0; i< temp.length; i++){
            if(!temp[i].equals("")){
                answer[j++] = temp[i];
            }
        }
        
        
        return answer;
    }
}