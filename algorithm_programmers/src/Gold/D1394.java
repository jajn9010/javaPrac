package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class D1394 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mod = 900528;
		HashMap<Character, Integer> map = new HashMap<>();
		
		String str = br.readLine();
		String word = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, i + 1);
			}
		}
		
		long temp = 1L;
		long[] arr = new long [1000001]; 
		arr[0] = temp;
		for (int i = 1; i < arr.length; i++) {
			temp *= str.length() % mod;
			temp %= mod;
			arr[i] = temp;
		}
		
		long ans = 0;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = word.length() - i - 1;
			ans += (map.get(c) * arr[index]) % mod;
			ans %= mod;
		}
		
		System.out.println(ans);
	}
}
