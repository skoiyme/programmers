class Solution {
    public int solution(int n) {
        int answer = 0;
        int answer2 = 0;
        
        for(int i=1; i<=n; i++) {
        	if(i%2 != 0) { 
        		answer+=i;
        	}
        	if(i%2 == 0) {
        		answer2+=i*i;
        	}
        }
        return n%2 != 0 ? answer : answer2; 
    }
}