class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int n = i; n <= j; n++){
            char c = (char)(k +'0');
            String s = String.valueOf(n);

            answer += countChar(s, c);
        }

        return answer;
    }

    public static int countChar(String str, char ch) {        
        return str.length() - str.replace(String.valueOf(ch), "").length();    
    }


}