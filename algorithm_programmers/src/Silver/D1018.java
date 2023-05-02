package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1018 {
	static char[] check = {'W', 'B'};
	static char[][] chess;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//주어진 배열의 크기 받음
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		//제공하는 나무판의 크기만큼 배열 만들기
		chess = new char [w][h];
		
		//한줄씩 문자 받아서 chess판에 넣어두기
		for (int i = 0; i < w; i++) {
			char[] ch = br.readLine().toCharArray();
			for (int j = 0; j < h; j++) {
				chess[i][j] = ch[j];
			}
		}
		
		// 최대 결과값과 최소값 구하기 위한 변수
		int min = 0;
		int ans = 64;
		
		// 가로 세로 배열 크기 확인 후 계산
		for(int i = 0; i <= w-8; i++) {
			for (int j = 0; j <= h-8; j++) {
				//좌표값이 주어졌을 때 한 칸의 좌표에서 칠해야 할 판 계산
				min = calc(i, j);
				ans = Math.min(ans, min);
			}
		}
		System.out.println(ans);
	}
	
	static int calc(int x, int y) {
		int min = 0;
		for(int i = x; i < x+8; i++) {
			for (int j = y; j < y+8; j++) {
				if(chess[i][j] == check[(i+j)%2]) {
					min++;
				}
			}
		}
		min = Math.min(64-min, min);
		return min;
	}
}
