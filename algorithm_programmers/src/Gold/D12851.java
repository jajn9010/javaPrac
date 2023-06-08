package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class D12851 {
	static int N, K;
    static int MAX_SIZE = 100001;
    static int min;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        min = Integer.MAX_VALUE;
        cnt = 0;
        if(N >= K){
            System.out.println((N-K)+"\n"+1);
            return;
        }
        bfs();
        System.out.println(min+"\n"+cnt);
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        int[] arr = new int[MAX_SIZE];
        arr[N] = 1;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            //now가 현재 최소 시간보다 큰 경우는 탐색할 필요가 없으므로 return
            //최적화
            if (min < arr[now]) break;
            int[] move = {now - 1, now + 1, now * 2};
            for (int i = 0; i < move.length; i++) {
                if (0 <= move[i] && move[i] < MAX_SIZE) {
                    //탐색한 시간이 K와 같으면 최소값을 갱신하고 카운트 증가
                    // arr[now]는 항상 최소 시간만 들어가 있다.
                    if (move[i] == K) {
                        min = arr[now];
                        cnt++;
                    }
                    //탐색을 한적이 없거나
                    //같은 시간대에 탐색했다면
                    if (arr[move[i]] == 0 || arr[move[i]] == arr[now] + 1) {
                        queue.add(move[i]);
                        arr[move[i]] = arr[now] + 1;
                    }
                }
            }
        }
    }
}