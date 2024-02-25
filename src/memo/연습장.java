package memo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class 연습장 {

	public static void main(String[] args) {

		연습장 a1 = new 연습장();

		int[] num = { 6,5 };
		//int[] num2 = { 3,3,3,3,3 };
		//String[] str = { "    programmers  " };

		System.out.print(Arrays.toString(a1.solution72("i    love  you")));
		//System.out.println(a1.solution72());
		// 장군11 병정2 일반
		//a1.solution47();
	}
	
	public String[] solution72(String my_string) {
        String[] answer = {};
        String str = "";
        str=my_string.replace(" +", "");
        //answer=str.split(" ");
        System.out.println(str);
        
        return answer;
    }
	
	public int solution71(int hp) {
        int answer = 0;
        int ant1 = 0;
        int ant2 = 0;
        int ant3 = 0;
        
        ant1=hp/5;
        ant2=hp%5/3;
        ant3=hp%5%3;
        
        answer=ant1+ant2+ant3;
        
        return answer;
    }
	
	
	public int[] solution70(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        Integer[] integerArr = new Integer[start_num-end_num+1];
        int num = 0;
        
        for(int i=end_num; i<=start_num; i++) {
        	answer[num]=i;
        	num++;
        }
        
        for(int i=0; i<answer.length; i++) {
        	integerArr[i]=answer[i];
        }
        Arrays.sort(integerArr, Collections.reverseOrder());
        
        for(int i=0; i<answer.length; i++) {
        	answer[i]=integerArr[i];
        }
        
        return answer;
    }
	
	
	public int[] solution69(String my_string) {
        int[] answer = {};
        int num = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        
        
        for(int i=0; i<my_string.length(); i++) {
        	if( my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57 ) {
        		list.add(Character.getNumericValue(my_string.charAt(i)));
        	}
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        
        
        Arrays.sort(answer);
        return answer;
    }
	
	public int solution68(String my_string, String target) {
        int answer = 0;
        for(int i=0; i<=my_string.length()-target.length(); i++) {
        		if(my_string.substring(i,target.length()+i).equals(target)) {
        			answer=1;
        		}
        		System.out.println(my_string.substring(i,target.length()+i));
        		
        }
        return answer;
    }
	
	public int[] solution67(int[] arr) {
        int[] answer = {};
        int n = 0;
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[i]; j++) {
        		idx++;
        	}
        }
        
        answer = new int[idx];
        
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[i]; j++) {
        		answer[n++]=arr[i];
        	}
        }
        
        
        
        return answer;
	}
	
	public String solution66(String my_string, int[] index_list) {
        String answer = "";
        for(int i=0; i<index_list.length; i++) {
        	answer+=my_string.substring(index_list[i],index_list[i]+1);
        }
        return answer;
    }
	
	public int[] solution65(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        for(int i=5; i<num_list.length; i++) {
        	answer[i-5]=num_list[i];
        }
        return answer;
    }
	
	public int solution64(int[] arr1, int[] arr2) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        if(arr1.length < arr2.length) {
        	return -1;
        }
        if(arr1.length > arr2.length) {
        	return 1;
        }
        for(int i=0; i<arr1.length; i++) {
        	num1+=arr1[i];
        	num2+=arr2[i];
        }
        
        if(num1 < num2) {
        	answer=-1;
        } 
        if(num1 > num2) {
        	answer=1;
        }
        		
        
        return answer;
    }
	
	public String[] solution63(String my_string) {
		
		ArrayList<String> list = new ArrayList<String>();
		
        String[] answer = {};
        
        int num = 0;
        
        for(int i=0; i<my_string.length(); i++) {
        	if(my_string.substring(i,i+1).equals(" ")) {
        		list.add(my_string.substring(num, i));
        		num=i+1;
        		
        	}
        }
        
        list.add(my_string.substring(num));
        
        answer= new String[list.size()];
        
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        
        return answer;
    }
	
	public String solution62(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length(); i+=code) {
        	answer.concat(cipher.substring(i, i+1));
        }
       
        return answer;
    }
	
	public int[] solution61(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
        	if(i%k == 0) {
        		list.add(i);
        	}
        }
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        	
        }
        
        return answer;
    }
	
	public String solution60(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++) {
        	switch (rsp.substring(i, i+1)){
            case "2":
                answer+="0";
                break;
            case "0":
            	answer+="5";
                break;
            case "5":
            	answer+="2";
                break;
            default:
        	}
        }
        return answer;
    }
	
	public String solution59(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++){
        	
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
            	answer+=str.substring(i,i+1).toLowerCase();
            }
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                answer+=str.substring(i,i+1).toUpperCase();
            }
        }
       
        return answer;
    }
	
	public String[] solution58(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0; i<strArr.length; i++) {
        	if(i%2 == 0) { // 짝수
        		answer[i]=strArr[i].toLowerCase();
        	} else {
        		answer[i]=strArr[i].toUpperCase();
        	}
        }
        return answer;
    }
	
	public String solution57(String rny_string) {
        String answer = "";
        answer = rny_string.replaceAll("m", "rn");
        return answer;
    }
	
	public int[] solution56(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
       for(int i=0; i<num_list.length; i++) {
    	   if(i < 5 ) {
    		   answer[i]=num_list[i];
    	   }
       }
        return answer;
    }
	
	
	public int solution55(String myString, String pat) {
        int answer = 0;
        myString=myString.toUpperCase();
        pat=pat.toUpperCase();
        if(myString.length() < pat.length()) {
        	return 0;
        }
        if(pat.equals(myString)) {
        	answer=1;
        }
        for(int i=0; i<myString.length()-pat.length(); i++) {
        	if(pat.equals(myString.substring(i, pat.length()+i))) {
        		answer=1;
        	}
        }
        
        return answer;
    }
	
	public int solution54(String my_string, String is_suffix) {
        int answer = 0;
        if(is_suffix.equals(my_string.substring(my_string.length()-is_suffix.length()))) {
        	answer = 1;
        }
        return answer;
    }
	
	public int[] solution53(int n, int[] numlist) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<numlist.length; i++) {
        	if(numlist[i]%n == 0) {
        		list.add(numlist[i]);
        	}
        }
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        return answer;
    }
	
	 public int[] solution52(int[] arr, int n) {
	        int[] answer = new int[arr.length];
	        for(int i=0; i<arr.length; i++) {
	        	answer[i]=arr[i];
	        	if(arr.length%2 != 0) {
	        		if(i%2 == 0) {
	        			answer[i]=arr[i]+n;
	        		}
	        	} else {
	        		if(i%2 != 0) {
	        			answer[i]=arr[i]+n;
	        		}
	        	}
	        }
	        
	        return answer;
	    }
	
	public int[] solution51(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i=0; i<num_list.length; i++) {
        	if(i < n) {
        		answer[i]=num_list[i];
        		System.out.println(answer);
        	}
        }
        return answer;
    }
	
	public int solution50(int[] num_list) {
        int answer = -1;
        
        for(int i=0; i<num_list.length; i++) {
        	
        	if(num_list[i] < 0) {
        		answer=i;
        		break;
        	}
        	
        }
        
        
        return answer;
    }
	
	public int[] solution49(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1]; 
        
        for(int i=1; i<5; i++) {
        	answer[i-1]=num_list[i];
        	System.out.println(answer[i-1]);
        }
        
        return answer;
    }
	
	public int solution48(int n, String control) {
        int answer = n;
        // w+1 s-1 d+10 a-10
        
        for(int i=0; i<control.length(); i++) {
        	switch (control.charAt(i)) {
        	case 'w' : answer+=1; break;
        	case 's' : answer+=-1; break;
        	case 'd' : answer+=10; break;
        	case 'a' : answer+=-10; break;
        	default:
        	}
        }
        return answer;
    }
	
	public void solution47() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2 == 0) {
			System.out.println(n+" is even");
		} else {
			System.out.println(n+" is odd");
		}
		
	}
	
	public String solution46(String my_string, int n) {
        String answer = "";
        answer=my_string.substring(0,n);
        return answer;
    }
	
	
	public int[] solution45(int[] num_list) {
        int[] answer = new int[num_list.length+1]; 
        int a = 0;
        int b = 0;
        
        a=num_list[num_list.length-1];
        b=num_list[num_list.length-2];
        
        for(int i=0; i<num_list.length; i++) {
        	answer[i]=num_list[i];
        }
        if(a > b) {
        	answer[num_list.length]=a-b;
        } else {
        	answer[num_list.length]=a*2;
        }
        return answer;
    }
	
	public int solution44(int n) {
        int answer = 0;
        int answer2 = 0;
        
        for(int i=1; i<=n; i++) {
        	//System.out.println(i);
        	if(i%2 != 0) { // 홀수일때
        		answer+=i;
        	}
        	if(i%2 == 0) {
        		answer2+=i*i;
        	}
        }
        return n%2 != 0 ? answer : answer2; 
    }
	
	public int[] solution43(int[] num_list, int n) {
        int[] answer = {};
        for(int i=0; i<num_list.length; i++) {
        	if(num_list[i] == num_list[n]) {
        		answer[i]=num_list[i];
        		System.out.println(answer[i]);
        	}
        }
        return answer;
    }
	
	public int solution42(int[] num_list) {
        int answer = 0;
        String even = ""; // 짝수
        String odd = ""; // 홀수
        for(int i=0; i<num_list.length; i++) {
        	if(num_list[i]%2 != 0) {
        		//홀수
        		odd=odd.concat(Integer.toString(num_list[i]));
        		//System.out.println(odd);
        	} else {
        		even=even.concat(Integer.toString(num_list[i]));
        		System.out.println(even);
        	}
        }
        
        answer=Integer.parseInt(even)+Integer.parseInt(odd);
        
        return answer;
    }
	
	public int solution41(int[] num, int n) {
        int answer = 0;
        for(int i=0; i<num.length; i++) {
    		if(n >= answer) {
    			answer+=num[i];
    		}
        }
        return answer;
    }
	
	public int solution40(int a, int b) {
        int answer = 0;
        String sum = ""+a+b;
        System.out.println(sum);
        int mul = a*b*2;
        if(Integer.parseInt(sum) >= mul) {
        	answer=Integer.parseInt(sum);
        } else {
        	answer=mul;
        }
        
        return answer;
    }
	
	public int solution39(int[] num_list) {
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
	
	public String solution38(String my_string, String alp) {
        String answer = "";
        answer=my_string.replace(alp, alp.toUpperCase());
        return answer;
    }

	public int solution37(int[] num_list) {
		int answer = 0;

		if (num_list.length >= 11) {
			for (int i = 0; i < num_list.length; i++) {
				answer = num_list[i] + answer;
			}
		} else {
			answer = 1;
			for (int i = 0; i < num_list.length; i++) {
				answer = num_list[i] * answer;
			}
		}
		return answer;
	}

	public int solution36(int a, int b) {
		int answer = 0;
		int ab = 0;
		int ba = 0;

		ab = Integer.parseInt(Integer.toString(a).concat(Integer.toString(b)));
		ba = Integer.parseInt(Integer.toString(b).concat(Integer.toString(a)));

		if (ab >= ba) {
			answer = ab;
		} else {
			answer = ba;
		}
		return answer;
	}

	public int solution35(int num, int n) {
		int answer = 0;
		if (num % n == 0) {
			return 1;
		}
		return answer;
	}

	public int solution34(String str1, String str2) {
		int answer = 0;
		for (int i = 0; i < str2.length() - str1.length() + 1; i++) {

			System.out.println(str2.substring(i, str1.length() + i));

			if (str2.substring(i, str1.length() + i).equals(str1)) {
				// str2가 charAt(i)만큼 돌면서 str1의 전체가 true일때
				return 1;
			}
		}
		return answer;
	}

	public String solution33(String myString) {
		String answer = "";
		for (int i = 0; i < myString.length(); i++) {
			// myString.charAt(i)돌면서 a가 65~~90 이면 -> +32를 더 해주면 될 것같다
			// myString.charAt(i)돌면서 a가 97 ~ 122였을땐 그대로
			if (myString.charAt(i) >= 97 && myString.charAt(i) <= 122) {
				answer += myString.charAt(i);
			}
			if (myString.charAt(i) >= 65 && myString.charAt(i) <= 90) {
				answer += Character.toString(myString.charAt(i) + 32);

			}

		}
		return answer;
	}

	public int solution32(String my_string, String is_prefix) {
		int answer = 0;
		if (my_string.length() < is_prefix.length()) {
			return 0;
		}
		for (int i = 0; i < is_prefix.length(); i++) {
			if (my_string.charAt(i) == is_prefix.charAt(i)) {
				answer++;
			}
		}
		if (answer == is_prefix.length()) {
			return 1;
		}
		return 0;
	}

	public int solution31(int[] num_list, int n) {
		int answer = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] == n) {
				return 1;
			}
		}
		return answer;
	}

	public int[] solution30(int[] arr, int k) {
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (k % 2 != 0) {
				answer[i] += arr[i] * k;
			} else {
				answer[i] += arr[i] + k;
			}
			System.out.println(answer[i]);
		}
		return answer;
	}

	public int solution29(int number, int n, int m) {
		int answer = 0;
		for (int i = 0; i < number; i++) { // 60만큼 1씩증가
			if (number % n == 0 && number % m == 0) {
				return 1;
			}
		}
		return answer;
	}

	public String solution28(String str, int n) {
		String answer = "";
		for (int i = str.length() - n; i < str.length(); i++) {
			answer = answer.concat(Character.toString(str.charAt(i)));

		}
		// answer=str.substring(str.length()-n);
		return answer;
	}

	public String solution27(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				answer += Character.toString(str.charAt(i));
			}

		}
		return answer;
	}

	// 0~9 : 48~57
	public int solution26(String str) {
		int answer = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				answer += Character.getNumericValue(str.charAt(i));

			}
		}

		return answer;
	}

	public int[] solution25(int n) {
		int[] answer = new int[n / 2];

		int a = 1;
		int j = 0;
		for (int i = 1; i <= n; i += 2) {
			answer[j++] = i;
		}

		return answer;
	}

	public int solution24(int n, int t) {
		int answer = n;
		for (int i = 0; i < t; i++) {
			answer = answer * 2;
		}
		return answer;
	}

	public int solution23(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (i * (n / i) == n) {
				if (i > n / i) {
					return answer * 2;
				} else if (i == n / i) {
					return answer * 2 + 1;
				}
				System.out.println(i + "," + n / i);
				answer++;
			}

		}
		return answer;
	}

	public int solution22(int price) {
		int answer = 0;
		if (price >= 100000) {
			answer = (int) (price * 0.95);
		} else if (price >= 300000 && price < 500000) {
			answer = (int) (price * 0.9);
		} else if (price >= 500000) {
			answer = (int) (price * 0.8);
		} else {
			answer = price;
		}

		return answer;
	}

	public int solution21(int[] dot) {
		int answer = 4;

		if (dot[0] > 0 && dot[1] > 0) {
			return 1;
		} else if (dot[0] < 0 && dot[1] > 0) {
			return 2;
		} else if (dot[0] < 0 && dot[1] < 0) {
			return 3;
		}

		return answer;
	}

	public int solution20(int[] sides) {
		int max = 0;
		int a = 0;
		int b = 0; // 더한값을 넣는방
		int answer = 2;
		for (int i = 0; i < sides.length; i++) {
			if (sides[i] > max) {
				max = sides[i];
				a = i;
			}
		}

		for (int i = 0; i < sides.length; i++) {
			if (a != i) {
				b += sides[i];
			}
		}

		if (max < b) {
			return 1;
		}

		return answer;
	}

	public int solution19(int[] array) {
		int answer = 0;
		Arrays.sort(array);
		answer = array[array.length / 2];

		return answer;
	}

	public int solution18(int n) {
		int answer = 0;
		if (n % 7 == 0) {
			answer = n / 7;
		} else {
			answer = n / 7 + 1;
		}
		return answer;
	}

	public int solution17(int[] numbers) {
		int max = numbers[0];
		int secondMax = 0;
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == max) {
				count++;
			}
		}

//	        if(count > 1) {
//	        	return max*max;
//	        }

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > secondMax) {
				secondMax = numbers[i];
			}
		}
		System.out.println(secondMax);
		System.out.println(max);

		return max * secondMax;
	}

	public String solution16(String[] str_list, String ex) {
		String answer = "";
		for (int i = 0; i < str_list.length; i++) {
			if (!str_list[i].contains(ex)) {
				answer = answer.concat(str_list[i]);
			}
		}
		return answer;
	}

	public int solution15(int slice, int n) {
		int answer = 0;
		if (n % slice == 0) {
			answer = n / slice;
		} else {
			answer = n / slice + 1;
		}
		return answer;
	}

	public int solution14(int n) {
		int answer = 2;
		for (int i = 1; i < 1000; i++) {
			if (i * i == n) {
				return 1;
			}
		}
		return answer;
	}

	public int[] solution12(int[] numbers, int num1, int num2) {
		int[] answer = new int[numbers.length];
		int aa = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i >= 1 && i <= 2) {
				answer[aa++] = numbers[i];
				System.out.println(numbers[i]);
			}
		}
		return answer;
	}

	public int[] solution11(int[] numbers) {
		int[] answer = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
			System.out.println(answer[i]);
		}
		return answer;
	}

	public int solution10(String[] s1, String[] s2) {
		int answer = 0;
		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s2[i].equals(s1[j])) {
					answer = answer + 1;
				}
			}
		}
		return answer;
	}

	public int solution9(int[] array, int n) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				answer = answer + 1;
			}
		}
		return answer;
	}

	public int[] solution8(int[] num_list) {
		int[] answer = { 0, 0 };
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				answer[0] = answer[0] + 1;
			} else {
				answer[1] = answer[1] + 1;
			}
		}
		return answer;
	}

	public int solution7(int[] array, int height) {
		int answer = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > height) {
				answer = answer + 1;
			}
		}
		return answer;
	}

	public int[] solution6(String[] strlist) {

		int[] answer = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
			System.out.println(answer[i]);
		}
		return answer;
	}

	public String solution5(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			answer = answer + str.charAt(str.length() - i - 1);
		}
		return answer;
	}

	public int[] solution4(int[] num) {
		int[] answer = new int[num.length];

		for (int i = 0; i < num.length; i++) {
			answer[i] = num[num.length - i - 1];
			System.out.println(Arrays.toString(answer));
		}

		return answer;
	}

	public String solution3(String my_string, String letter) {
		String answer = "";
		int leng = my_string.length();

		for (int i = 0; i < leng; i++) {
			if (my_string.charAt(i) != letter.charAt(0)) {
				answer = answer.concat(i + my_string.substring(i, i + 1) + ",");
			}
		}
		return answer;

	}

	public int solution2(String str1, String str2) {
		int answer = 2;
		for (int i = 0; i <= str1.length() - str2.length(); i++) {

			System.out.println("i: " + i + ", " + str1.substring(i, str2.length() + i));

			if (str1.substring(i, str2.length() + i).equals(str2)) {
				return 1;
			} else {
				answer = 2;
			}
		}
		return answer;
	}

	// 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
	// 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를
	// 먹었다면 총얼마를 지불해야 하는지
	// return 하도록 solution 함수를 완성해보세요.

	public int solution(int n, int k) {
//		int nn = 0;
//		// n이 나머지0이 될때 k를 -2000원으로 하나씩 증가
////		for(int i=0; i<n/10; i++) {
////			k -= 1;
////		}
//		
//		k = k - (n/10);
//		
//		nn = 12000*n+k*2000;
//		
		return 0;

	}

}
