class Solution {
    public int solution(int a, int b) {
int answer = 0;
        int ab = 0;
        int ba = 0;
        
        ab= Integer.parseInt(Integer.toString(a).concat(Integer.toString(b)));
        ba= Integer.parseInt(Integer.toString(b).concat(Integer.toString(a)));
        
        if(ab >= ba) {
        	answer=ab;
        } else {
        	answer=ba;
        }
        return answer;
    }
}