class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++) {
        	switch (rsp.substring(i, i+1)){
            case "2":
                answer=answer.concat("0");
                break;
            case "0":
            	answer=answer.concat("5");
                break;
            case "5":
            	answer=answer.concat("2");
                break;
            default:
        	}
        }
        return answer;
    }
}