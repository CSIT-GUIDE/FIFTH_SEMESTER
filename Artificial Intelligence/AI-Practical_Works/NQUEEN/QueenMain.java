import java.util.Scanner;

class QueenMain {
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
