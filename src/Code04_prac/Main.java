package Code04_prac;

public class Main {
	//P176 練習2
//	public static void main(String[] args) {
//		int[] moneyList = {12902, 8302, 55100};
//		//通常for文		
//		for (int i = 0; i < moneyList.length; i++) {
//			System.out.print(moneyList[i] + " ");
//		}
//		System.out.println("");
//		for (int j : moneyList) {
//			System.out.print(j + " ");
//		}
//	}
//}
	//練習4
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください。");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input) {
				System.out.println("アタリ");
			}
		}
		System.out.println("");
//		拡張for文,↑の通常for文と同じ結果
		for (int i : numbers) {
			if (i == input) {
				System.out.println("アタリ");
			}
		}
	}
}