class Solution {
   public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i : array){
            int abs = Math.abs(n - i);
            
            if(abs < min){
                min = abs;
                answer = i;
                continue;
            }
            
            if(abs == min && answer > i){
                answer = i;
            }
        }
        
        return answer;
    }
}