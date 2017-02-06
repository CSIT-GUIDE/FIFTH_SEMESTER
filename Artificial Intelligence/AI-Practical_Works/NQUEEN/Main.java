import java.util.Scanner;

public class Main {

	static Scanner scan;
	static int N = 4;
	
	static void printBoard(int board[][]) {
		int i;
		for (i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				if (board[i][j] == 1) {
					System.out.print("Q\t");
				} else {
					System.out.print("_\t");
				}
			System.out.println("\n");
		}
	}

	static boolean toPlaceOrNotToPlace(int board[][], int row, int col) {
		int i, j;
		for (i = 0; i < col; i++) {
			if (board[row][i] == 1)
				return false;
		}
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		for (i = row, j = col; j >= 0 && i < N; i++, j--) {
			if (board[i][j] == 1)
				return false;
		}
		return true;
	}

	static boolean theBoardSolver(int board[][], int col) {
		if (col >= N)
			return true;
		for (int i = 0; i < N; i++) {
			if (toPlaceOrNotToPlace(board, i, col)) {
				board[i][col] = 1;
				if (theBoardSolver(board, col + 1))
					return true;
				board[i][col] = 0;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("State the value of N in this program!");
		N = scan.nextInt();
		int[][] board = new int[N][N];
		if (!theBoardSolver(board, 0)) {
			System.out.println("Solution not found.");
		}
		printBoard(board);
	}
}
