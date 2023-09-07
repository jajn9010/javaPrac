package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D13549 {
	static class Loc{
        int idx;
        int time;

        public Loc(int idx, int time) {
            this.idx = idx;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 수빈이의 위치
        int k = Integer.parseInt(st.nextToken()); // 동생의 위치

        int[]  visited = new int[100001];

        Queue<Loc> q = new LinkedList<>(); // location(위치) 저장
        q.add(new Loc(n, 1));
        visited[n] = 1; 

        while (!q.isEmpty()) {
            Loc now = q.poll();

            if(now.idx+1>=0 && now.idx+1<=100000){ // 앞으로 한칸
                if(visited[now.idx+1] == 0 || visited[now.idx+1] > now.time+1){
                    visited[now.idx+1] = now.time+1;
                    q.add(new Loc(now.idx + 1, now.time + 1));
                }
            }

            if(now.idx-1>=0 && now.idx-1<=100000){ // 뒤로 한칸
                if(visited[now.idx-1] == 0 || visited[now.idx-1] > now.time+1) {
                    visited[now.idx - 1] = now.time + 1;
                    q.add(new Loc(now.idx - 1, now.time + 1));
                }
            }

            if(now.idx*2>=0 && now.idx*2<=100000){ // 순간이동
                if(visited[now.idx*2] == 0 || visited[now.idx*2] > now.time) {
                    visited[now.idx*2] = now.time;
                    q.add(new Loc(now.idx*2, now.time));
                }
            }
        }
        System.out.println(visited[k]-1);
    }
}