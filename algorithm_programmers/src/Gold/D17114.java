package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D17114 {
	static int m, n, o, p, q, r, s, t, u, v, w;
	static int[] dm = {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	static int[] dn = {0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	static int[] dO = {0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	static int[] dp = {0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	static int[] dq = {0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	static int[] dr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	static int[] ds = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
	static int[] dt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0};
	static int[] du = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0};
	static int[] dv = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0};
	static int[] dw = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1};
	static int[][][][][][][][][][][] map;
	static Queue<int[]> que;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		o = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		u = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		
		map = new int[w][v][u][t][s][r][q][p][o][n][m];
		que = new LinkedList<>();
		
		for (int iw = 0; iw < w; iw++) {
			for (int iv = 0; iv < v; iv++) {
				for (int iu = 0; iu < u; iu++) {
					for (int it = 0; it < t; it++) {
						for (int is = 0; is < s; is++) {
							for (int ir = 0; ir < r; ir++) {
								for (int iq = 0; iq < q; iq++) {
									for (int ip = 0; ip < p; ip++) {
										for (int io = 0; io < o; io++) {
											for (int in = 0; in < n; in++) {
												st = new StringTokenizer(br.readLine());
												for (int im = 0; im < m; im++) {
													map[iw][iv][iu][it][is][ir][iq][ip][io][in][im] = Integer.parseInt(st.nextToken());
													if(map[iw][iv][iu][it][is][ir][iq][ip][io][in][im] == 1) que.add(new int[] {iw, iv, iu, it, is, ir, iq, ip, io, in, im});
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println(bfs());
	}

	private static int bfs() {
		while(!que.isEmpty()) {
			int[] curr = que.poll();
			int currM = curr[10];
			int currN = curr[9];
			int currO = curr[8];
			int currP = curr[7];
			int currQ = curr[6];
			int currR = curr[5];
			int currS = curr[4];
			int currT = curr[3];
			int currU = curr[2];
			int currV = curr[1];
			int currW = curr[0];
			
			for (int i = 0; i < 22; i++) {
				int nextM = currM + dm[i];
				int nextN = currN + dn[i];
				int nextO = currO + dO[i];
				int nextP = currP + dp[i];
				int nextQ = currQ + dq[i];
				int nextR = currR + dr[i];
				int nextS = currS + ds[i];
				int nextT = currT + dt[i];
				int nextU = currU + du[i];
				int nextV = currV + dv[i];
				int nextW = currW + dw[i];
				
				if(nextM >= 0 && nextM < m && nextN >= 0 && nextN < n && nextO >= 0 && nextO < o && nextP >= 0 && nextP < p &&
						nextQ >= 0 && nextQ < q && nextR >= 0 && nextR < r && nextS >= 0 && nextS < s && nextT >= 0 && nextT < t &&
						nextU >= 0 && nextU < u && nextV >= 0 && nextV < v && nextW >= 0 && nextW < w) {
					if(map[nextW][nextV][nextU][nextT][nextS][nextR][nextQ][nextP][nextO][nextN][nextM] == 0) {
						que.add(new int[] {nextW, nextV, nextU, nextT, nextS, nextR, nextQ, nextP, nextO, nextN, nextM});
						map[nextW][nextV][nextU][nextT][nextS][nextR][nextQ][nextP][nextO][nextN][nextM] = 
								map[currW][currV][currU][currT][currS][currR][currQ][currP][currO][currN][currM] + 1;
					}
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for (int iw = 0; iw < w; iw++) {
			for (int iv = 0; iv < v; iv++) {
				for (int iu = 0; iu < u; iu++) {
					for (int it = 0; it < t; it++) {
						for (int is = 0; is < s; is++) {
							for (int ir = 0; ir < r; ir++) {
								for (int iq = 0; iq < q; iq++) {
									for (int ip = 0; ip < p; ip++) {
										for (int io = 0; io < o; io++) {
											for (int in = 0; in < n; in++) {
												for (int im = 0; im < m; im++) {
													if(map[iw][iv][iu][it][is][ir][iq][ip][io][in][im] == 0) return -1;
													if(map[iw][iv][iu][it][is][ir][iq][ip][io][in][im] > max) max = map[iw][iv][iu][it][is][ir][iq][ip][io][in][im];
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		if(max == 1) return 0;
		else return max - 1 ;
	}
}
