class Solution {
    public int solution(int a, int b) {
                int answer = 0;
        String sum = Integer.toString(a)+(b);
        int mul = a*b*2;
        if(Integer.parseInt(sum) >= mul) {
        	answer=Integer.parseInt(sum);
        } else {
        	answer=mul;
        }
        
        return answer;
    }
}