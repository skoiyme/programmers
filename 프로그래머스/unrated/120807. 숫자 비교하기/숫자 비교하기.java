class Solution {
    public int solution(int num1, int num2) {
        boolean a = (num1>=0 && num1<=10000);
        if(num1 == num2 && a){
            return 1;
        } else {
            return -1;
        }
    }
}