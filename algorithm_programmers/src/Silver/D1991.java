package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1991 {
	static StringBuilder sb = new StringBuilder();
	static Node head = new Node ('A', null, null);
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			char root = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			insert_Node(head, root, left, right);
		}
		
		pre(head);
		sb.append("\n");
		in(head);
		sb.append("\n");
		pos(head);
		System.out.println(sb);
	}
	
	private static void pos(Node node) {
		if(node == null) return;
		pos(node.left);
		pos(node.right);
		sb.append(node.value);
	}

	private static void in(Node node) {
		if(node == null) return;
		in(node.left);
		sb.append(node.value);
		in(node.right);
	}

	private static void pre(Node node) {
		if(node == null) return;
		sb.append(node.value);
		pre(node.left);
		pre(node.right);
	}

	private static void insert_Node(Node node, char root, char left, char right) {
		if(node.value == root) {
			node.left = (left == '.')? null : new Node(left, null, null);
			node.right = (right == '.')? null : new Node(right, null, null);
		} else {
			if(node.left != null) insert_Node(node.left, root, left, right);
			if(node.right != null) insert_Node(node.right, root, left, right);
		}
	}

	static class Node {
		char value;
		Node left;
		Node right;
		
		Node(char val, Node left, Node right) {
			this.value = val;
			this.left = left;
			this.right = right;
		}
	}
}
