class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        for(int i=0; i<num_list.length; i++) {
        	mul=num_list[i]*mul;
        	sum=num_list[i]+sum;
        }
        if(mul < sum*sum) {
        	return 1;
        } else {
        	return 0;
        }
    }
}