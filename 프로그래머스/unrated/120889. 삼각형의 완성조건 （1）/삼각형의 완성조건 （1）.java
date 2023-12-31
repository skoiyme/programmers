import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int sum = 0;
        Arrays.sort(sides);
        sum=sides[0]+sides[1];
        if(sides[2] < sum){
            return 1;
        }
      
        return answer;
    }
}