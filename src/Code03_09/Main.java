package Code03_09;

public class Main {

	public static void main(String[] args) {
		// for文のループによる繰り返しをネストして九九表 P131
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j);
//				↓は空白出力
				System.out.print("   ");
			}
//			↓は改行を出力
			System.out.println("");
		}
	}
}
