package ex01.arrayAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DA1 {
	static class Point {
		int x, y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Point A = new Point(-1, 0);
		Point Q = new Point(-1, 1);
		Point W = new Point(0, 1);
		Point E = new Point(1, 1);
		Point D = new Point(1, 0);
		Point C = new Point(1, -1);
		Point X = new Point(0, -1);
		Point Z = new Point(-1, -1);
		
		
	}
}
