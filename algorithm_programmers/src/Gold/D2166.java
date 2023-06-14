package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D2166 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		long N = Integer.parseInt(br.readLine());
		ArrayList<Point> list = new ArrayList<>();

		long x = 0, y = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			long a = Integer.parseInt(st.nextToken());
			long b = Integer.parseInt(st.nextToken());

			list.add(new Point(a, b));

			if (i == 0) {
				x = a;
				y = b;
			}
		}
		list.add(new Point(x, y));

		long totalA = 0, totalB = 0;
		for (int i = 0; i < N; i++) {
			totalA += (list.get(i).x * list.get(i + 1).y);
			totalB += (list.get(i).y * list.get(i + 1).x);
		}
		
		String s = String.format("%.1f", Math.abs((totalA - totalB) / 2.0));
		
		System.out.println(s);
	}

	public static class Point {
		long x, y;

		Point(long x, long y) {
			this.x = x;
			this.y = y;
		}
	}
}
