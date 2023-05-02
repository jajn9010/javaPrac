package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D10845 {
	static int last;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> q = new LinkedList<>();

		int T = Integer.parseInt(st.nextToken());

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if (str.equals("push")) {
				last =Integer.parseInt(st.nextToken());
				q.add(last);
			}else if (str.equals("pop")) {
				if (q.isEmpty())
					sb.append(-1).append("\n");
				else {
					int a = q.poll();
					sb.append(a).append("\n");
				}
			}else if (str.equals("size")) {
				sb.append(q.size()).append("\n");
			}else if (str.equals("empty")) {
				if (q.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
			}else if (str.equals("front")) {
				if (q.isEmpty())
					sb.append(-1).append("\n");
				else {
					int a = q.peek();
					sb.append(a).append("\n");
				}
			}else if (str.equals("back")) {
				if (q.isEmpty())
					sb.append(-1).append("\n");
				else {
					sb.append(last).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
