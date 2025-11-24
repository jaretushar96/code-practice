import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{

    static int N, M;
    static char[][] grid;
    static String word;

    static boolean[][] visited;
    static int minFault = Integer.MAX_VALUE;

    static class Clue 
    {
        int time;
        int x1, y1, x2, y2;

        Clue(int t, int a, int b, int c, int d) {
            time = t;
            x1 = a;
            y1 = b;
            x2 = c;
            y2 = d;
        }

        boolean violates(int r, int c) {
            return (r >= x1 && r <= x2 && c >= y1 && c <= y2);
        }
    }

    static List<Clue> clues = new ArrayList<>();

    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    static void checkClues(List<int[]> path) {
        int faults = 0;

        for (Clue cl : clues) {
            int t = cl.time;
            if (t <= 0 || t > path.size()) continue;

            int[] pos = path.get(t - 1);
            int r = pos[0];
            int c = pos[1];

            if (cl.violates(r, c)) {
                faults++;
                if (faults >= minFault) return;
            }
        }

        minFault = Math.min(minFault, faults);
    }

    static void dfs(int r, int c, int idx, List<int[]> path) {
        if (idx == word.length()) {
            checkClues(path);
            return;
        }

        for (int k = 0; k < 4; k++) {
            int nr = r + dr[k];
            int nc = c + dc[k];

            if (nr < 1 || nc < 1 || nr > N || nc > M) continue;
            if (visited[nr][nc]) continue;
            if (grid[nr][nc] != word.charAt(idx)) continue;

            visited[nr][nc] = true;
            path.add(new int[]{nr, nc});

            dfs(nr, nc, idx + 1, path);

            path.remove(path.size() - 1);
            visited[nr][nc] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        grid = new char[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        int I = sc.nextInt();
        for (int i = 0; i < I; i++) {
            int T = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            clues.add(new Clue(T, x1, y1, x2, y2));
        }

        word = sc.next();

        List<int[]> starts = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (grid[i][j] == word.charAt(0)) {
                    starts.add(new int[]{i, j});
                }
            }
        }

        if (starts.isEmpty()) {
            System.out.println("Impossible");
            return;
        }

        visited = new boolean[N + 1][M + 1];

        for (int[] st : starts) {
            visited[st[0]][st[1]] = true;

            List<int[]> path = new ArrayList<>();
            path.add(new int[]{st[0], st[1]});

            dfs(st[0], st[1], 1, path);

            visited[st[0]][st[1]] = false;
        }

        if (minFault == Integer.MAX_VALUE) {
            System.out.println("Impossible");
        } else if (minFault == 0) {
            System.out.println("All clues are correct");
        } else {
            System.out.println(minFault);
        }
    }
}
