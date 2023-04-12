package ex01.arrayAlgorithm;

import java.util.Arrays;

public class K번째수 {
	public static void main(String[] args) {
		
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            int ed = commands[i][1];
            int st = commands[i][0];

            int[] temp = new int[ed - st + 1];

            for (int j = 0; j <= ed-st; j++) {
                temp[j] = arr[j + st - 1];
            }

            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
		System.out.println(Arrays.toString(answer));
	}
}
