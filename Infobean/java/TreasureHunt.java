import java.util.Scanner;

public class TreasureHunt 
{
    static int N, M, K;
    static char[][] grid;
    static int[][] treasureValue;
    static int maxTreasure = 0;

    static int[] dx = {0, 0, -1};
    static int[] dy = {-1, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        grid = new char[N][M];
        for (int i = 0; i < N; i++)
         {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++)
             {
                grid[i][j] = line.charAt(j * 2); // skip spaces
            }
        }

        int startX = sc.nextInt();
        int startY = sc.nextInt();
        sc.nextLine();

        int pearl = sc.nextInt();
        int platinum = sc.nextInt();
        int gold = sc.nextInt();
        int diamond = sc.nextInt();
        sc.nextLine();

        K = sc.nextInt();
        sc.close();

        // Assign numeric values to treasures
        treasureValue = new int[N][M];
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j < M; j++) 
            {
                char c = grid[i][j];
                if (c == '$') treasureValue[i][j] = pearl;
                else if (c == '*') treasureValue[i][j] = platinum;
                else if (c == '%') treasureValue[i][j] = gold;
                else if (c == '+') treasureValue[i][j] = diamond;
                else treasureValue[i][j] = 0;
            }
        }

        boolean[][] visited = new boolean[N][M];
        dfs(startX, startY, 0, 0, visited);

        System.out.println(maxTreasure);
    }

    static void dfs(int x, int y, int steps, int collected, boolean[][] visited) {
        if (steps > K) return;
        if (x == N - 1) return; // cannot end on last row

        collected += treasureValue[x][y];
        maxTreasure = Math.max(maxTreasure, collected);

        visited[x][y] = true;

        for (int dir = 0; dir < 3; dir++) 
        {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx >= 0 && nx < N && ny >= 0 && ny < M && grid[nx][ny] != '#') 
            {
                int finalX = nx;

                // Apply gravity: slide down until stable cell or rock
                while (finalX + 1 < N && grid[finalX + 1][ny] != '#' &&
                        (grid[finalX + 1][ny] == '*' || grid[finalX + 1][ny] == '$' ||
                         grid[finalX + 1][ny] == '%' || grid[finalX + 1][ny] == '+')) 
                {
                    finalX++;
                }

                if (!visited[finalX][ny]) 
                {
                    dfs(finalX, ny, steps + 1, collected, visited);
                }
            }
        }

        visited[x][y] = false;
    }
}
