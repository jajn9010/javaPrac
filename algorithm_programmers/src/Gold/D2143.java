package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D2143 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long T = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] b = new int[m];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < n; i++) {
			a[i] += a[i - 1];
		}
		
		for (int i = 1; i < m; i++) {
			b[i] += b[i - 1];
		}
		
		int aSize = n * (n + 1) / 2;
		int bSize = m * (m + 1) / 2;
		
		long[] aSum = new long[aSize];
		int idx = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int val = a[j];
				if(i > 0) val -= a[i - 1];
				aSum[idx++] = val;
			}
		}
		
		long[] bSum = new long[bSize];
		idx = 0;
		for (int i = 0; i < m; i++) {
			for (int j = i; j < m; j++) {
				int val = b[j];
				if(i > 0) val -= b[i - 1];
				bSum[idx++] = val;
			}
		}
		
		Arrays.sort(aSum);
		Arrays.sort(bSum);
		
		int left = 0;
		int right = bSize - 1;
		long cnt = 0;
		
		while(left < aSize && right >= 0) {
			long asv = aSum[left];
			long bsv = bSum[right];
			long sum = asv + bsv;
			if(sum == T) {
				long aa = 0, bb = 0;
				while(left < aSize && asv == aSum[left]) {
					left++;
					aa++;
				}
				while(right > -1 && bsv == bSum[right]) {
					right--;
					bb++;
				}
				cnt += aa * bb;
			}
			
			if(sum > T) right--;
			else if (sum < T) left++;
		}
		
		System.out.println(cnt);
	}
}
