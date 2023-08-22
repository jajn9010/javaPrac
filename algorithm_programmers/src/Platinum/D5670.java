package Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class D5670 {
	public static class Node {
		private HashMap<Character, Node> childs = new HashMap<>();
		private boolean isLastChar;
		
		boolean isLastChar() {
			return this.isLastChar;
		}
		
		void setLastChar(boolean isLastChar) {
			this.isLastChar = isLastChar;
		}
		
		HashMap<Character, Node> getChilds() {
			return this.childs;
		}
	}
	
	public static class Trie {
		private Node rootNode;
		
		Trie() {
			rootNode = new Node();
		}
		
		void insert(String word) {
			Node thisNode = this.rootNode;
			
			for (int i = 0; i < word.length(); i++) {
				thisNode = thisNode.getChilds().computeIfAbsent(word.charAt(i), c -> new Node());
			}
			thisNode.setLastChar(true);
		}
		
		int contains(String word) {
			Node thisNode = this.rootNode;
			int count = 1;
			
			thisNode = thisNode.getChilds().get(word.charAt(0));
			
			for (int i = 1; i < word.length(); i++) {
				if(thisNode.childs.size() >= 2) count++;
				else if(thisNode.childs.size() == 1 && thisNode.isLastChar) count++;
				
				char ch = word.charAt(i);
				thisNode = thisNode.getChilds().get(ch);
			}
			
			return count;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		while((str = br.readLine()) != null) {
			int num = Integer.parseInt(str);
			ArrayList<String> list = new ArrayList<>();
			Trie trie = new Trie();
			
			for (int i = 0; i < num; i++) {
				String word = br.readLine();
				list.add(word);
				trie.insert(word);
			}
			
			double sum = 0;
			for (String s : list) sum += trie.contains(s);
			
			double avg = sum / num;
			sb.append(String.format("%.2f", avg)).append("\n");
			
			str = br.readLine();
		}
		
		System.out.println(sb);
	}
}
