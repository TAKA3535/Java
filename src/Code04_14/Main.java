package Code04_14;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		//拡張for文,ループ変数や配列の添え字を記述する必要がない
		for (int value : scores) {
			System.out.print(value + " ");
		}
		System.out.println("");
		//普通のfor文	
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
	}
}
