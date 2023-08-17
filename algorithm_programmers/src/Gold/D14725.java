package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D14725 {
	public static class Node {
		private HashMap<String, Node> childNode = new HashMap<>();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Node root = new Node();
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int size = Integer.parseInt(st.nextToken());
			Node curr = root;
			
			for (int j = 0; j < size; j++) {
				String str = st.nextToken();
				if(!curr.childNode.containsKey(str)) {
					curr.childNode.put(str, new Node());
				}
				curr = curr.childNode.get(str);
			}
		}
		print(root, "");
	}

	private static void print(Node root, String bar) {
		Object[] key = root.childNode.keySet().toArray();
		Arrays.sort(key);
		
		for(Object s : key) {
			System.out.println(bar + s);
			print(root.childNode.get(s), bar + "--");
		}
	}
}
