package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D10845_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		int T = Integer.parseInt(st.nextToken());
		
		while(T-- > 0) {
			st =  new StringTokenizer(br.readLine());
			String a = st.nextToken();
			if(a.equals("push")) {
				arr.add(Integer.parseInt(st.nextToken()));
			}else if(a.equals("pop")) {
				if(arr.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(arr.get(0)).append("\n");
					arr.remove(0);
				}
			}else if(a.equals("size")) {
				sb.append(arr.size()).append("\n");
			}else if(a.equals("empty")) {
				if(arr.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
			}else if(a.equals("front")) {
				if(arr.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(arr.get(0)).append("\n");
				}
			}else if(a.equals("back")) {
				if(arr.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(arr.get(arr.size()-1)).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
