package Code03_prac;

public class Main {

//	public static void main(String[] args) {
//		// 練習３ P135
//		int isHungry = 0;
//		String food = "hoge";
//		
//		System.out.println("こんちには");
//		if (isHungry == 0) {
//			System.out.println("おなかいっぱい");
//		} else {
//			System.out.println("おなかすいた");
//		}
//		if (isHungry == 1) {
//			System.out.println(food + "を食べる");
//		}
//	}
//
//}
	
//	練習５
//	public static void main(String[] args) {
//		System.out.println("「メニュー」1:検索 2:登録 3:削除 4:変更>");
//		int selected = new java.util.Scanner(System.in).nextInt();
//		switch (selected) {
//		case 1:
//			System.out.println("検索します");
//			break;
//		case 2:
//			System.out.println("登録します");
//			break;
//		case 3:
//			System.out.println("削除します");
//			break;
//		case 4:
//			System.out.println("変更します");
//			break;
//		}
//	}
//}

//練習６
	public static void main(String[] args) {
		System.out.println("数あてゲーム");
		int ran = new java.util.Random().nextInt(10);
		System.out.println(ran);
//		for () はチャレンジできる回数
		for (int i = 0; i < 5; i++) {
			System.out.println("0～9を入力してください");
			int input = new java.util.Scanner(System.in).nextInt();
			if (ran == input) {
				System.out.println("アタリ");
				break;
			} else {
				System.out.println("ハズレ");
			}
		}
		System.out.println("ゲームを終了します。");
	}
}

	
	
	