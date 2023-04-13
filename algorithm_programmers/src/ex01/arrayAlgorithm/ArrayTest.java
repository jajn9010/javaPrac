/*
package ex01.arrayAlgorithm;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		
		long n = 12345;
		
		String number = String.valueOf(n);
		char[] ch = number.toCharArray();
		int[] answer = new int[number.length()];
				
			for (int i = ch.length-1; i >= 0; i--) {
				answer[ch.length-1 -i] = ch[i]-'0';
		}
		System.out.println(Arrays.toString(answer));		
	}
}
//*/

/*
package ex01.arrayAlgorithm;

public class ArrayTest {
	public static void main(String[] args) {
		
		long n = 118372;
		
		String answer = "";
        String str = Long.toString(n);
        
        int[] arr = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+1);
            arr[i] = Integer.parseInt(s);           
        }
        
        for(int j = 0; j < str.length()-1; j++){
            for(int i = 0; i < str.length()-1; i++) {
                if (arr[i] < arr[i+1]) {
                    int tmp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        
        for(int i = 0; i < str.length(); i++){
            answer += arr[i];
        }
        
        System.out.println(Long.parseLong(answer));
	}
}
//*/

//*
package ex01.arrayAlgorithm;

//import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int a = 3;
		String answer = "";
		answer = (a == 8)? "정답" : "오답"; 
		System.out.println(answer);
		
//		int n = 6;
//		int[] arr1 = {46, 33, 33 ,22, 31, 50};
//		int[] arr2 = {27 ,56, 19, 14, 14, 10};
//		
//		String[] answer = new String[n];
//		
//		for (int i = 0; i < n; i++) {
//			String[] str = new String[n];
//			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//			if(answer[i].length()<n) {
//				for(int j = 0; j < n-answer[i].length(); j++) {
//					String s = "0";
//					answer[i] = s.concat(answer[i]);
//					
//				}
//			}
//			
//			for(int j = 0; j < n; j++) {
//				answer[i].substring(j, j+1);
//				str[j] = answer[i].substring(j, j+1);
//				
//				if(str[j].equals("1")) {
//					str[j] = "#";
//					answer[i] += str[j];
//				}else answer[i] += " ";
//				
//				
//			}
//			answer[i] = answer[i].substring(n);
//		}
//		
//		System.out.println(Arrays.toString(answer));
	}
}
//*/