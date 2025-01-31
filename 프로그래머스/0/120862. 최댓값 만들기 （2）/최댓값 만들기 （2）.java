class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
               int n = numbers[i]*numbers[j];
                if(answer <= n){
                    answer = n;
                }
            }
        }
        
        return answer;
    }
}