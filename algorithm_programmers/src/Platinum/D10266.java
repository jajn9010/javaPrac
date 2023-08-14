package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D10266 {
	static int size = 360000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] clock1 = new int[size * 2];
		int[] clock2 = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			clock1[num] = 1;
			clock1[size + num] = 1;
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			clock2[num] = 1;
		}
		
		kmp(clock1, clock2);
	}

	private static void kmp(int[] clock1, int[] clock2) {
		int[] table = makeTable(clock2);
		int idx = 0;
		for (int i = 0; i < size * 2; i++) {
			while(idx > 0 && clock1[i] != clock2[idx]) {
				idx = table[idx - 1];
			}
			
			if(clock1[i] == clock2[idx]) {
				if(idx == size - 1) {
					System.out.println("possible");
					return;
				} else {
					idx++;
				}
			}
		}
		System.out.println("impossible");
	}

	private static int[] makeTable(int[] clock) {
		int idx = 0;
		int[] table = new int[size];
		for (int i = 1; i < size; i++) {
			while(idx > 0 && clock[i] != clock[idx]) {
				idx = table[idx - 1];
			}
			
			if(clock[i] == clock[idx]) {
				table[i] = ++idx;
			}
		}
		return table;
	}
}
