import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SecretKeyFinder 
{

    static int rows, cols, keyLength, numClues;
    static char[][] grid;
    static List<Clue>[] cluesPerTime; 
    static int[] dx = {-1, 1, 0, 0}; 
    static int[] dy = {0, 0, -1, 1};
    static Set<String> foundKeys = new HashSet<>();

    
    static class Clue 
    {
        int x1, y1, x2, y2;
        Clue(int x1, int y1, int x2, int y2) {
            this.x1 = x1 - 1; 
            this.y1 = y1 - 1;
            this.x2 = x2 - 1;
            this.y2 = y2 - 1;
        }
        boolean forbids(int r, int c) {
            return r >= x1 && r <= x2 && c >= y1 && c <= y2;
        }
    }

   
    static boolean isValid(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }


    static boolean allowedAtTime(int r, int c, int time) {
        for (Clue clue : cluesPerTime[time]) {
            if (clue.forbids(r, c)) return false;
        }
        return true;
    }


    static void dfs(int r, int c, int time, boolean[][] visited, StringBuilder path) {
        if (!allowedAtTime(r, c, time) || visited[r][c]) return;

        visited[r][c] = true;
        path.append(grid[r][c]);

        if (time == keyLength) {
            foundKeys.add(path.toString());
        } else {
            for (int i = 0; i < 4; i++) {
                int nr = r + dx[i];
                int nc = c + dy[i];
                if (isValid(nr, nc)) {
                    dfs(nr, nc, time + 1, visited, path);
                }
            }
        }

        visited[r][c] = false;
        path.deleteCharAt(path.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        rows = sc.nextInt();
        cols = sc.nextInt();
        grid = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }


        keyLength = sc.nextInt();
        numClues = sc.nextInt();


        @SuppressWarnings("unchecked")
        List<Clue>[] temp = (ArrayList<Clue>[]) new ArrayList[keyLength + 1];
        cluesPerTime = temp;
        for (int i = 1; i <= keyLength; i++) cluesPerTime[i] = new ArrayList<>();

       
        for (int i = 0; i < numClues; i++) {
            int timeStep = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            cluesPerTime[timeStep].add(new Clue(x1, y1, x2, y2));
        }

        boolean[][] visited = new boolean[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(i, j, 1, visited, new StringBuilder());
            }
        }

      
        if (foundKeys.size() == 1) {
            System.out.println(foundKeys.iterator().next());
        } else {
            System.out.println("Not enough clues");
        }
    }
}
