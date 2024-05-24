import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int king = scan.nextInt();
		int queen = scan.nextInt();
		int rook = scan.nextInt();
		int bishop = scan.nextInt();
		int knight = scan.nextInt();
		int pawn = scan.nextInt();

		int king1 = 1;
		int queen1 = 1;
		int rook1 = 2;
		int bishop1 = 2;
		int knight1 = 2;
		int pawn1 = 8;
//		

		king1 -= king;

		queen1 -= queen;

		rook1 -= rook;

		bishop1 -= bishop;

		knight1 -= knight;

		pawn1 -= pawn;

		System.out.printf("%d %d %d %d %d %d", king1, queen1, rook1, bishop1, knight1, pawn1);

	}

}