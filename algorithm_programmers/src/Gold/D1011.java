package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1011 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int num = y - x;
			int temp = 0;
			for (int i = 1; i < num; i++) {
				if (num - 2 * i < 0)
					break;
				num = num - 2 * i;
				temp = i;
			}
			if (num == 0) {
				System.out.println(2 * temp);
			} else if (num > temp + 1) {
				System.out.println(2 * temp + 2);
			} else {
				System.out.println(2 * temp + 1);
			}
		}
	}
}
