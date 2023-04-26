package D_1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int j = 0;
		int temp = 0;
		int[] list = new int[T];
		
		st = new StringTokenizer(br.readLine());
		while(j < T) {
			list[j] = Integer.parseInt(st.nextToken());
			j++;
		}
		Arrays.sort(list);
		if(list.length%2 == 0) {
			temp = list[list.length/2-1] * list[list.length/2];
		}else {
			temp = (int) Math.pow(list[list.length/2], 2);
		}
		System.out.println(temp);
	}
}
