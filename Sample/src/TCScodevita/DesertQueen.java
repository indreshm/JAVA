package TCScodevita;
import java.util.*;


class Position {
    int x, y, water;

    Position(int x, int y, int water) {
        this.x = x;
        this.y = y;
        this.water = water;
    }
}

public class DesertQueen {
	
	public static int minimumWater(char[][] grid, int N, int startX, int startY, int endX, int endY) {
		int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] waterConsumed = new int[N][N];
        for (int[] row : waterConsumed) Arrays.fill(row, Integer.MAX_VALUE);

        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(startX, startY, 0));
        waterConsumed[startX][startY] = 0;

        while (!queue.isEmpty()) {
            Position current = queue.poll();

            for (int[] direction : directions) {
                int newX = current.x + direction[0];
                int newY = current.y + direction[1];

                if (newX >= 0 && newY >= 0 && newX < N && newY < N && grid[newX][newY] != 'M') {
                    int additionalWater = (grid[current.x][current.y] == 'T' && grid[newX][newY] == 'T') ? 0 : 1;
                    int newWater = current.water + additionalWater;

                    if (newWater < waterConsumed[newX][newY]) {
                        waterConsumed[newX][newY] = newWater;
                        queue.offer(new Position(newX, newY, newWater));
                    }
                }
            }
        }

        return waterConsumed[endX][endY] == Integer.MAX_VALUE ? -1 : waterConsumed[endX][endY];
    }
	
    
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        try {
	            int N = sc.nextInt();
	            sc.nextLine();

	            if (N <= 0 || N > 25) {
	                System.out.println("Invalid grid size.");
	                return;
	            }

	            char[][] grid = new char[N][N];
	            int startX = -1, startY = -1, endX = -1, endY = -1;

	            for (int i = 0; i < N; i++) {
	                String[] row = sc.nextLine().split(" ");
	                if (row.length != N) {
	                    System.out.println("Invalid input.");
	                    return;
	                }

	                for (int j = 0; j < N; j++) {
	                    grid[i][j] = row[j].charAt(0);
	                    if (grid[i][j] == 'S') {
	                        startX = i;
	                        startY = j;
	                    } else if (grid[i][j] == 'E') {
	                        endX = i;
	                        endY = j;
	                    } else if (grid[i][j] != 'D' && grid[i][j] != 'T' && grid[i][j] != 'M') {
	                        System.out.println("Invalid grid element: " + grid[i][j]);
	                        return;
	                    }
	                }
	            }

	            if (startX == -1 || startY == -1 || endX == -1 || endY == -1) {
	                System.out.println("Missing start or end position.");
	                return;
	            }

	            int result = minimumWater(grid, N, startX, startY, endX, endY);
	            System.out.println(result);

	        } catch (Exception e) {
	            System.out.println("Invalid input. Please check the format.");
	        } finally {
	            sc.close();
	        }
	}

}
