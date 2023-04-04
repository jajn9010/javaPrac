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

//*
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