class Solution {
    public String solution(String my_string, int[] indices) {
        char[] arr = my_string.toCharArray();

        for(int i : indices){
            arr[i] = ',';
        }

        StringBuffer sb = new StringBuffer();

        for(char c : arr){
            if(c != ','){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}