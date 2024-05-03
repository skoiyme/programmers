import java.util.stream.Stream;
class Solution {
    public String solution(int age) {
        int ascll = 97;
		int[] n = Stream.of(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray();
		char[] alphabets = new char[n.length];
		for (int i = 0; i < n.length; i++) {
			alphabets[i] = (char) (ascll+n[i]);
		}
		return String.copyValueOf(alphabets);
    }
}