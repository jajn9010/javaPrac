package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class D2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[T];
		
		for (int i = 0; i <T; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		sb.append(avg(arr)).append("\n");
		sb.append(mid(arr)).append("\n");
		sb.append(mode(arr)).append("\n");
		sb.append(round(arr)).append("\n");
		System.out.println(sb);
	}

	private static int round(int[] arr) {
		int max = -4000;
		int min = 4000;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return max - min;
	}

	private static int mode(int[] arr) {
		int mode = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		int numbers = 0;
		for(int key : map.values()) {
			numbers = Math.max(numbers, key);
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int key : map.keySet()) {
			if(map.get(key) == numbers) {
				list.add(key);
			}
		}
		
		Collections.sort(list);
		
		if(list.size() > 1) {
			mode = list.get(1);
		} else {
			mode = list.get(0);
		}
        
		return mode;
	}

	private static int mid(int[] arr) {
		int n = arr.length/2;
		Arrays.sort(arr);
		return arr[n];
	}

	private static int avg(int[] arr) {
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		return (int) Math.round(total/arr.length);
	}
}
